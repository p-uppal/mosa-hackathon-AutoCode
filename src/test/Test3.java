public class Test3() {
	private int count;

	public Test3() {
		
	}
	public Test3(String name) {
		
	}
	public static void quickSort(int[] int_array) {
		recursiveSort(int_array, 0, int_array.length - 1);
	}
	public static void recursiveSort(int[] int_array, int startInd, int endInd) {
		int index = partition(int_array, startInd, endInd);
		if (startInd < index - 1) {
			recursiveSort(int_array, startInd, index - 1);
		}
		if (endInd > index) {
			recursiveSort(int_array, index, endInd);
		}
	}
	public static int partition(int[] int_array, int left, int right) {
		int pivot = int_array[left];
		while (left <= right) {
			while (int_array[left] < pivot) {
				left++;
			}
			while (int_array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = int_array[left];
				int_array[left] = int_array[right];
				int_array[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
	public static ArrayList<String> readTXT(String file) throws FileNotFoundException {
		ArrayList<String> lines = new ArrayList<String>();
		try (Scanner s = new Scanner(new File(file))) {
			while (s.hasNextLine()) {
				lines.add(s.nextLine().trim());
		}
		}
		return lines;
	}
	public static void writeToFile(ArrayList<String> lines, String fileToWrite) throws IOException {
	try (FileWriter fw = new FileWriter(fileToWrite); PrintWriter out = new PrintWriter(fw)) {
			for (String line : lines) {
				out.println(line);
			}
		}
	}
}
