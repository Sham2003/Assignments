package com.training.day7;

import java.util.Arrays;

public class QuickSortDemo {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = low - 1;      
 
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {141, 46, 23, 11, 214, 78, 5, 23, 1, 5124, 5, 6, 2, 111, 31513};

        System.out.println("Before sort: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sort: " + Arrays.toString(arr));
    }
}
