package lotto;
import java.net.*;
import java.io.*;
public class User {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private String id;
	private Byte[] numbers;
	
	User(Socket s, ObjectInputStream ois, ObjectOutputStream oos, String id){
		this.socket = s;
		this.ois = ois;
		this.oos = oos;
		this.id = id;
	}
	
	User(String id, Byte[] numbers){
		this.id = id;
		this.numbers= numbers;
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
	public String getID() {
		return id;
	}
}
