package lotto;

import java.net.*;
import java.util.*;
import java.io.*;

public class Client {
	Socket socket = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	ClientUI clientUI = null;
	
	public Client(ClientUI clientUI) {
		try {
			socket = new Socket("localhost", 5432);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			this.clientUI = clientUI;
			String msg = null;
			while(true) {
//			User usernot = (User) ois.readObject();
			msg = (String)ois.readObject();
//			msg = usernot.getID();
			clientUI.showMessage("이번호가 맞습니까" + msg + '\n');
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void send(Object obj) {

		try {
			oos.writeObject(obj);
		} catch (Exception e) {

		}
	}
}
