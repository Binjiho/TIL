package chatting;

import java.net.*;
import java.util.*;
import java.io.*;

public class ChattingClient {
//	   Scanner scanner = null;
	   Socket socket = null;
	   ObjectOutputStream oos = null;
	   ObjectInputStream ois = null;
	   ChattingClientUI clientUI = null; //Scanner��ſ� 
	   
	   public ChattingClient(ChattingClientUI clientUI) {           //�����Ҷ� ���ѹ� ClientUI�� �ڱ� �ּ� �Ѱ���
	      try {

	         socket = new Socket("localhost", 5432);
	         oos = new ObjectOutputStream(socket.getOutputStream());
	         ois = new ObjectInputStream(socket.getInputStream());
             this.clientUI = clientUI;
// AnonymousInnerClass
// class MyThread extends Thread{} --> MyThread�̸�����, new MyThread()
			new Thread() {
				public void run() {
					try {
						String msg = null;
						while (true) {
							msg=(String) ois.readObject();
							// clientUI ���� �޼����� ����
							clientUI.showMessage(msg+'\n');
						}
					} catch (Exception e) {
					}
				}
			}.start();

		} catch (Exception e) {
		}
	}

	public void communicate(String msg) {
		try {
			oos.writeObject(msg);
		} catch (Exception e) {
		}
	}
}
