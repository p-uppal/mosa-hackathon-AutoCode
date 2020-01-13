public Tester() {
	public static void writeToFile(ArrayList<String> lines, String fileToWrite) throws IOException {
	try (FileWriter fw = new FileWriter(fileToWrite); PrintWriter out = new PrintWriter(fw)) {
			for (String line : lines) {
				out.println(line);
			}
		}
	}
}
