package Recursion;

public class Main {
    public static int fibonacciNumber(int n){
        if(n==0 || n ==1){
            return n;
        }
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    public static void main(String[] args) throws Exception{
        int num = 7;
        System.out. println(fibonacciNumber(num));
    }
}
