package Array;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[]arr){
        for(int i=0;i<arr.length-1; i++){

            for( int j=0; j<arr.length-i-1;j++){ // j loop will run for 5 times
                if (arr[j+1] <arr[j]){
                        int temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr=new int[]{2,3,5,8,2,4};
        int[] sortedArray=bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

}
