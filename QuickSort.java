import java.util.*;
public class QuickSort {
	static int partition(int[] A, int start, int end) {
		int pivot = A[end];
		int partitionIndex = start-1;
		for(int i=start;i<end;i++) {
			if(A[i] <= pivot) {
				partitionIndex++;
				swap(A,partitionIndex,i);
			}
		}
		swap(A,partitionIndex+1,end);
		return partitionIndex+1;
	}

	static void quickSort(int[] A, int start, int end) {
		if(start < end) {
			int index = partition(A,start,end);
			quickSort(A,start,index-1);
			quickSort(A,index+1,end);
		}
	}

	static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String[] args) {

		int[] input = {2,8,7,1,3,5,6,4};
		System.out.println("The input array : " + Arrays.toString(input));
		quickSort(input,0,7);
		System.out.println("The sorted array : " + Arrays.toString(input)); 

	}

}
