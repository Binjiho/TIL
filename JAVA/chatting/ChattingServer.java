package chatting;

import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ChattingServer {
	private ServerSocket serverSocket = null;
	
	private ArrayList<User> users = new ArrayList<User>(); //User를 담을 arraylist생성
	
	private ChattingServer() {
		try {
			serverSocket = new ServerSocket(5432); //1회			
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
				String name = (String) ois.readObject();
				User user = new User(socket, ois, oos,name);
				users.add(user);
//	Thread
				Thread t = new ChatServerThread(user);
				/*
		    	System.out.print("사용자 이름 입력: ");
		    	Scanner sc = new Scanner(System.in);
				String threadname = sc.nextLine();
				
				t.setName(threadname);
				*/
			
				t.start();
			}
		}catch(Exception e) {
			System.out.println("소켓 객채 생성 실패");
		}
	}

	private class ChatServerThread extends Thread {
		private User user = null;

		private ChatServerThread(User user) {
			this.user = user;
		}

		public void run() {
			ObjectInputStream ois = user.getObjectInputStream();
			ObjectOutputStream oos = user.getObjectOutputStream();

			try {
				String msg = null;
//				String name = (String) ois.readObject();
//				System.out.println(name + "님이 채팅방 참여하였습니다.");

				while ((msg = (String) ois.readObject()) != null) {
//					System.out.println(name + ":" + msg);
//					oos.writeObject(name + ":" + msg);
//	broadcast
					broadcast(user.getName() + ":" + msg);
//					broadcast(this.getName() + ":" + msg);           Thread name받아오기
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
//			oos.close();
//			ois.close();
//			socket.close();
		}catch(Exception e) {
			System.out.println("disconnect실패");
		}
	}
	public static void main(String[] args) {
		ChattingServer server = new ChattingServer();
		server.connectClient();
//		server.communicate(user);
//		server.disconnectClient(user);
	}
}
