package ioconsole;

import java.io.*;
import java.util.Scanner;

public class SaveKeyInput2 {
    public static void main(String[] args) {
        File file = new File("keyinput.txt");

        try {
        	
        	Scanner reader = new Scanner(System.in); 
            PrintWriter writer = new PrintWriter(new FileWriter(file));

            System.out.print("Enter file text.  ");
            System.out.println("[Type ctrl-z to stop.]");

            String line;
            while (reader.hasNext()) {
            	line = reader.nextLine();
            	writer.println(line);
            }

            reader.close();
            writer.close();            
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}

