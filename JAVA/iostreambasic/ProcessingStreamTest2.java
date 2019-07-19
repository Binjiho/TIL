package iostreambasic;

import java.io.*;

public class ProcessingStreamTest2 {
	public static void main(String[] args) {
		try {
			FileReader input = new FileReader(args[0]);
			BufferedReader reader = new BufferedReader(input);
			try {
				FileWriter output = new FileWriter(args[1]);
				BufferedWriter writer = new BufferedWriter(output);
				try {
					String line;

					while ((line = reader.readLine()) != null) {
						writer.write(line);
						writer.newLine();
					}
				} finally {
					writer.close();
				}
			} finally {
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
