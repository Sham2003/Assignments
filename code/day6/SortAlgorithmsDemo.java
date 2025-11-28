package com.training.day6;

import java.util.Arrays;

public class SortAlgorithmsDemo {
	
	public static void BubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0,mc = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				int i1 = j, i2 = j+1;
				if(arr[i1] > arr[i2]) {
					temp = arr[i1];
					arr[i1] = arr[i2];
					arr[i2] = temp;
					//System.out.println("Swap "+ mc+ ": \t" + Arrays.toString(arr));
					mc++;
				}
			}
		}
		
		System.out.println("Total Swaps = "+ mc);
	}
	
	public static void SelectionSort(int[] arr) {
		int n = arr.length;
		int temp = 0,mc = 0;
		for(int i=0;i<n-1;i++) {
			int si = i;
			for(int j= i +1;j<n;j++) {
				if(arr[j] < arr[si]) {
					si = j;
				}
			}
			if(si != i ) {
				temp = arr[si];
				arr[si] = arr[i];
				arr[i] = temp;
				//System.out.println("Swap "+ mc+ ": \t" + Arrays.toString(arr));
				mc++;
			}
			
		}
		
		System.out.println("Total Swaps = "+ mc);
	}
	
	public static void InsertionSort(int[] arr) {
        int n = arr.length;
        int shifts = 0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift right
                j--;
                shifts++;
                System.out.println("Shift "+ shifts+ ": \t" + Arrays.toString(arr));
            }
            arr[j + 1] = key;
            System.out.println("Key "+ shifts+ ": \t" + Arrays.toString(arr));
        }
        System.out.println("Insertion Sort → Total Shifts = " + shifts);
    }
	
	
	public static void main(String[] args) {
	    int arr[] = {6464, 2322, 141, 66, 32, 1, 23, 4, 5, 14, 10, 7, 6, 2, 2};
	    System.out.println("Original Array: ");
	    System.out.println(Arrays.toString(arr));

	    /*int bubbleArr[] = Arrays.copyOf(arr, arr.length);
	    BubbleSort(bubbleArr);
	    System.out.println("BS= " + Arrays.toString(bubbleArr));

	    int selectionArr[] = Arrays.copyOf(arr, arr.length);
	    SelectionSort(selectionArr);
	    System.out.println("SS= " + Arrays.toString(selectionArr));*/
	    
	    int insertionArr[] = Arrays.copyOf(arr, arr.length);
	    InsertionSort(insertionArr);
	    System.out.println("IS= " + Arrays.toString(insertionArr));
	}

}
