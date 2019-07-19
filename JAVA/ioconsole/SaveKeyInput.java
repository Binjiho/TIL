package ioconsole;

import java.io.*;

public class SaveKeyInput {
    public static void main(String[] args) {
        File file = new File("keyinput.txt");

        try {
        	
        	InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(isr);
            
            PrintWriter writer = new PrintWriter(new FileWriter(file));

            System.out.print("Enter file text.  ");
            System.out.println("[Type ctrl-z to stop.]");

            String line;
            while ((line = reader.readLine()) != null) {
            	writer.println(line);
            }

            reader.close();
            writer.close();            
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}

