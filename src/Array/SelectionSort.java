package Array;

import java.util.Arrays;

public class SelectionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]> arr[min]) {
                    min = j;
                }
            }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

    return arr;
    }


        public static void main (String[]args){
            int[] arr = new int[]{7, 3, 6, 2, 4};
            int[] sortedArray = insertionSort(arr);
            System.out.println(Arrays.toString(sortedArray));
        }
    }

