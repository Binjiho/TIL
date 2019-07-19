package iostreambasic;

import java.io.*;

public class ProcessingStreamTest {
    public static void main(String[] args) {
        try {
            FileReader input = new FileReader("original.txt");
            BufferedReader reader = new BufferedReader(input);
            FileWriter output = new FileWriter("copy2.txt");
            PrintWriter writer = new PrintWriter(output);

            String line;

            while ((line = reader.readLine()) != null) {
                writer.println(line);

            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
