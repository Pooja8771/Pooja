package Recursion;

public class Main2 {

    public static int func(int[] arr, int n)
    {
        if(n<=1) return 0;
        int result = Math.max(func(arr,n-1), arr[1]-arr[0]);
        return result;
    }

    public static void main(String[] args){
        int[] arr = {3,5,26,4};
        System.out.println(func(arr,10));
    }
}