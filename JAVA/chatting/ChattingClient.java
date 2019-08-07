package chatting;

import java.net.*;
import java.util.*;
import java.io.*;

public class ChattingClient {
	 Scanner scanner = null;
	   Socket socket = null;
	   ObjectOutputStream oos = null;
	   ObjectInputStream ois = null;

	   public ChattingClient() {
	      try {
	         socket = new Socket("localhost", 5432);
	         oos = new ObjectOutputStream(socket.getOutputStream());
	         ois = new ObjectInputStream(socket.getInputStream());
	         scanner = new Scanner(System.in);
	         System.out.print("사용자 이름을 입력해주세요 \t");
	         String name = (String) scanner.nextLine();
	         System.out.println("입장자: " + name);
	         oos.writeObject(name);
	      } catch (Exception e) {

	      }
	   }

	   public void communicate() {
	      try {
	         String msg = null;
	         while ((msg = (String) scanner.nextLine()) != null) {
	            oos.writeObject(msg);
	            System.out.println((String) ois.readObject());
	         }
	      } catch (Exception e) {

	      } finally {
	         try {
	            oos.close();
	            socket.close();
	            ois.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	   public static void main(String[] args) {
	      ChattingClient client = new ChattingClient();
	      client.communicate();
	   }
	}