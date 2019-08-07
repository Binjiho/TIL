package chatting;
//UserŬ������ socket,ObjectInputStream,ObjectOutputStream�� ��������

import java.net.*;
import java.io.*;

class User {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	User(Socket s, ObjectInputStream ois, ObjectOutputStream oos){
		this.socket = s;
		this.ois = ois;
		this.oos = oos;
	}
	
	public Socket getSocket() {
		return socket;
	}
	
	public ObjectInputStream getObjectInputStream() {
		return ois;
	}
	public ObjectOutputStream getObjectOutputStream() {
		return oos;
	}
}
