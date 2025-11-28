package com.training.day6;

import java.util.Arrays;

public class SearchAlgorithmsDemo {
	public static int linearSearch(int[] arr, int ele) {
		int index = -1;
		for(int i=0;i<arr.length;i++)
			if(arr[i] == ele) {
				index = i;
				break;
			}
		return index;
	}
	
	public static int binarySearch(int[] arr, int ele) {
		int low = 0,high = arr.length -1,mid;
		while(low <= high) {
			mid = (low + high) / 2;
			if(arr[mid] == ele)
				return mid;
			else if(ele > arr[mid])
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10,14,6,7,2,141,6464,66,2,32,2322};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int res = binarySearch(arr, 2);
		
		System.out.println("Element found at "+ res);
	}
}
