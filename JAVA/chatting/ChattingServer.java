package chatting;

import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ChattingServer {
	private ServerSocket serverSocket = null;
	
	private ArrayList<User> users = new ArrayList<User>(); //User�� ���� arraylist����
	
	private ChattingServer() {
		try {
			serverSocket = new ServerSocket(5432); //1ȸ			
		}catch(Exception e) {
			System.out.println("���� ���� ���� ����");
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
		    	System.out.print("����� �̸� �Է�: ");
		    	Scanner sc = new Scanner(System.in);
				String threadname = sc.nextLine();
				
				t.setName(threadname);
				*/
			
				t.start();
			}
		}catch(Exception e) {
			System.out.println("���� ��ä ���� ����");
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
//				System.out.println(name + "���� ä�ù� �����Ͽ����ϴ�.");

				while ((msg = (String) ois.readObject()) != null) {
//					System.out.println(name + ":" + msg);
//					oos.writeObject(name + ":" + msg);
//	broadcast
					broadcast(user.getName() + ":" + msg);
//					broadcast(this.getName() + ":" + msg);           Thread name�޾ƿ���
				}
			} catch (Exception e) {
				System.out.println("�޼��� �ۼ��� ����");
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
				System.out.println("��ε�ĳ��Ʈ ����");
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
			System.out.println("disconnect����");
		}
	}
	public static void main(String[] args) {
		ChattingServer server = new ChattingServer();
		server.connectClient();
//		server.communicate(user);
//		server.disconnectClient(user);
	}
}
