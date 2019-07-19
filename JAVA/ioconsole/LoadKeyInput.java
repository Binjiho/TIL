package ioconsole;

import java.io.*;

public class LoadKeyInput {
    public static void main(String[] args) {
        File file = new File("keyinput.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close();

        } catch (FileNotFoundException fe) {
            System.err.println("File not found: " + file);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}

