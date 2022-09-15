package Array;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[]arr){ // 5,4,2,3,1
        for(int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]){
                int temp= arr[i];
                int vPosition=i-1;

             while(vPosition>0 && arr[vPosition-1]>temp ){
                 vPosition--;
             }
             for(int j=i-1;j>=vPosition;j--){
                 arr[j+1]=arr[j];
             }
             arr[vPosition]= temp;
            }

        }
       return arr;
    }
    public static void main(String[] args) {
        int [] arr= new int[]{ 5,4,2,3,1};
        int []insertionSort= insertionSort(arr);
        System.out.println(Arrays.toString(insertionSort));
    }
}
