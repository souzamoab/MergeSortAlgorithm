package main;

import java.io.IOException;
import java.util.Arrays;

import mergesort.MergeSort;
import file.File;

public class Main {
	public static void main(String[] args) throws IOException {
		
		MergeSort mergeSort = new MergeSort();
		File file = new File();
		
		int[] vector = file.readFile();
		int size = vector.length;
		
		mergeSort.mergeSort(vector, size);
		file.writeFile(vector);
		System.out.println(size);
		System.out.println(Arrays.toString(vector));
		
	}
}
