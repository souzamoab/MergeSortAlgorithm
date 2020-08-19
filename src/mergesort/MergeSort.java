package mergesort;

public class MergeSort {
	
	public void mergeSort(int[] vector, int size) {
		int mid = 0;
		
		if(size < 2) {
			return;
		}
		
		if(size % 2 == 0) {
			mid = size / 2;
		} else {
			double sizeDouble = Double.valueOf(size);
			double midDouble = sizeDouble / 2;
			
			midDouble = Math.floor(midDouble);
			mid = (int)midDouble;
		}
		
		int[] vectorLeft = new int[mid];
		int[] vectorRight = new int[size - mid];
		
		for(int i = 0; i < mid; i++) {
			vectorLeft[i] = vector[i];
		}
		
		for(int i = mid; i < size; i++) {
			vectorRight[i - mid] = vector[i];
		}
		
		mergeSort(vectorLeft, mid);
		mergeSort(vectorRight, size - mid);
		merge(vector, vectorLeft, vectorRight, mid, size - mid);
	}
	
	public void merge(int[] vector, int[] vectorLeft, int[] vectorRight, int left, int right) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left && j < right) {
			if(vectorLeft[i] <= vectorRight[j]) {
				vector[k++] = vectorLeft[i++];
			}else {
				vector[k++] = vectorRight[j++];
			}
		}
		
		while(i < left) {
			vector[k++] = vectorLeft[i++];
		}
		
		while(j < right) {
			vector[k++] = vectorRight[j++];
		}
	}

}
