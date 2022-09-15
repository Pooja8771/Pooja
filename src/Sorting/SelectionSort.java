package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if(arr[j]<arr[min])
                    min = j;

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }


        public static void main(String[]args){
            int[]arr = {64,25,12,22,11};
            selectionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

