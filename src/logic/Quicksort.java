package logic;

import java.util.Arrays;

public class Quicksort {
	boolean isPrivate;

	public Quicksort(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

    @Override
    public String toString() {
    	String quicksortStr = 
    			"\t" + (isPrivate?"private":"public") + " static void quickSort(int[] int_array) {\n" + 
    			"\t\trecursiveSort(int_array, 0, int_array.length - 1);\n" + 
    			"\t}\n" + 
    			"\t" + (isPrivate?"private":"public") + " static void recursiveSort(int[] int_array, int startInd, int endInd) {\n" + 
    			"\t\tint index = partition(int_array, startInd, endInd);\n" + 
    			"\t\tif (startInd < index - 1) {\n" + 
    			"\t\t\trecursiveSort(int_array, startInd, index - 1);\n" + 
    			"\t\t}\n" + 
    			"\t\tif (endInd > index) {\n" + 
    			"\t\t\trecursiveSort(int_array, index, endInd);\n" + 
    			"\t\t}\n" + 
    			"\t}\n" + 
    			"\t" + (isPrivate?"private":"public") + " static int partition(int[] int_array, int left, int right) {\n" + 
    			"\t\tint pivot = int_array[left];\n" + 
    			"\t\twhile (left <= right) {\n" + 
    			"\t\t\twhile (int_array[left] < pivot) {\n" + 
    			"\t\t\t\tleft++;\n" + 
    			"\t\t\t}\n" + 
    			"\t\t\twhile (int_array[right] > pivot) {\n" + 
    			"\t\t\t\tright--;\n" + 
    			"\t\t\t}\n" + 
    			"\t\t\tif (left <= right) {\n" + 
    			"\t\t\t\tint temp = int_array[left];\n" + 
    			"\t\t\t\tint_array[left] = int_array[right];\n" + 
    			"\t\t\t\tint_array[right] = temp;\n" + 
    			"\t\t\t\tleft++;\n" + 
    			"\t\t\t\tright--;\n" + 
    			"\t\t\t}\n" + 
    			"\t\t}\n" + 
    			"\t\treturn left;\n" + 
    			"\t}\n";
    	return quicksortStr;
    }
}

