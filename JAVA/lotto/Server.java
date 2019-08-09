package lotto;

import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

public class Server {
private ServerSocket serverSocket = null;
	
	private ArrayList<User> users = new ArrayList<User>(); 
	
	private Server() {
		try {
			serverSocket = new ServerSocket(5432); 		
		}catch(Exception e) {
			System.out.println("서버 소켓 생성 실패");
		}
	}
	private void connectClient() {
		Socket socket = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		try {
			while (true) {
				
				socket = serverSocket.accept();
				ois = new ObjectInputStream(socket.getInputStream());
				oos = new ObjectOutputStream(socket.getOutputStream());
				User usernot = (User)ois.readObject();
				User user = new User(socket, ois, oos,usernot.getID());
				users.add(user);
//	Thread
				Thread t = new ServerThread(user);
				t.start();
			}
		}catch(Exception e) {
			System.out.println("소켓 객채 생성 실패");
		}
	}

	private class ServerThread extends Thread {
		private User user = null;

		private ServerThread(User user) {
			this.user = user;
		}

		public void run() {
			ObjectInputStream ois = user.getObjectInputStream();
			ObjectOutputStream oos = user.getObjectOutputStream();

			try {
				User user = null;
//				String name = (String) ois.readObject();
//				System.out.println(name + "님이 채팅방 참여하였습니다.");

				while ((user = (User) ois.readObject()) != null) {
//	broadcast
					broadcast(user.getID());       
				}
			} catch (Exception e) {
				System.out.println("메세지 송수신 에러");
			}
		}
	}
	private void broadcast(String msg) {
		ObjectOutputStream oos = null;
		for (User user : users) {
			oos = user.getObjectOutputStream();
			try {
				oos.writeObject(msg);
			} catch (Exception e) {
				System.out.println("브로드캐스트 실패");
			}
		}
	}
	
	private void disconnectClient(User user) {
		Socket socket = user.getSocket();
		ObjectInputStream ois=user.getObjectInputStream();
		ObjectOutputStream oos=user.getObjectOutputStream();
		
		try {
			if(oos!=null)oos.close();
			if(ois!=null)ois.close();
			if(socket!=null)socket.close();
		}catch(Exception e) {
			System.out.println("disconnect실패");
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.connectClient();
	}
}
