package logic;

public class FileRW {

	public String getRWString(int type) {
		String function = "";
		
		switch (type) {
			case 1: // Read TXT
				function = 
						"\tpublic static ArrayList<String> readTXT(String file) throws FileNotFoundException {\n" + 
						"\t\tArrayList<String> lines = new ArrayList<String>();\n" + 
						"\t\ttry (Scanner s = new Scanner(new File(file))) {\n" + 
						"\t\t\twhile (s.hasNextLine()) {\n" + 
						"\t\t\t\tlines.add(s.nextLine().trim());\n" + 
						"\t\t}\n" + 
						"\t\t}\n" + 
						"\t\treturn lines;\n" + 
						"\t}\n";
				break;
			case 2: //Write TXT
				function = 
						"\tpublic static void writeToFile(ArrayList<String> lines, String fileToWrite) throws IOException {\n" + 
						"\ttry (FileWriter fw = new FileWriter(fileToWrite); PrintWriter out = new PrintWriter(fw)) {\n" + 
						"\t\t\tfor (String line : lines) {\n" + 
						"\t\t\t\tout.println(line);\n" + 
						"\t\t\t}\n" + 
						"\t\t}\n" + 
						"\t}\n";
				break;
			case 3: //Read CSV
				function = 
						"\tpublic static ArrayList<String[]> readCSV(String file) throws FileNotFoundException {\n" + 
						"\t\tArrayList<String[]> csvLine = new ArrayList<String[]>();\n" + 
						"\t\ttry (Scanner s = new Scanner(new File(file))) {\n" + 
						"\t\t\ts.nextLine();\n" + 
						"\t\t\twhile (s.hasNextLine()) {\n" + 
						"\t\t\t\tString info = s.nextLine();\n" + 
						"\t\t\t\tString[] bitsOfInfo = info.split(\",\");\n" + 
						"\t\t\t\tcsvLine.add(bitsOfInfo);\n" + 
						"\t\t\t}\n" + 
						"\t\t}\n" + 
						"\t\treturn csvLine;\n" + 
						"\t}\n";
				break;
			case 4:
				function = 
						"\tpublic static void writeCSV(ArrayList<String[]> cell_Lines, String fileToWrite) throws IOException {\n" + 
						"\t\ttry (FileWriter fw = new FileWriter(fileToWrite); PrintWriter out = new PrintWriter(fw)) {\n" + 
						"\t\t\tfor (String[] cell_Line: cell_Lines) {\n" + 
						"\t\t\t\tString full = \"\";\n" + 
						"\t\t\t\tfor (String cell : cell_Line) {\n" + 
						"\t\t\t\t\tfull += cell + \",\";\n" + 
						"\t\t\t\t}\n" + 
						"\t\t\t\tout.println(full);\n" + 
						"\t\t\t}\n" + 
						"\t\t} \n" + 
						"\t}\n";
				break;
		}
		return function;
	}
}
