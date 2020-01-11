package writing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteJava {
	public static void writeToFile(ArrayList<String> code, String filename) throws IOException {
		try (FileWriter fw = new FileWriter(filename); PrintWriter out = new PrintWriter(fw)) {

			for (int i = 0; i < code.size(); i++) {
				String line = code.get(i);
				out.print(line+"\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	public static void main(String[] args) {
		ArrayList<String> codetest = new ArrayList<String>();
		codetest.add("package test;\n");
		codetest.add("public class Test {");
		codetest.add("\tpublic static void main(String[] args) {");
		codetest.add("        System.out.println(\"it works\");");
		codetest.add("\t}");
		codetest.add("}");
		
		try {
			writeToFile(codetest,"C:\\Users\\Puneet Uppal\\Documents\\Programming\\github\\mosa-hackathon-AutoCode\\src\\test\\Test.java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
}
