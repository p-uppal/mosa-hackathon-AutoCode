package writing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteJava {
	
	public static void writeToFile(String code, String filename) throws IOException {
		try (FileWriter fw = new FileWriter(filename); PrintWriter out = new PrintWriter(fw)) {
				out.print(code);
			}


	}
}
