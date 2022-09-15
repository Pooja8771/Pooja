package Array;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int product=1;
        for(int i=1;i<n;i++){
            product= product*i;
        }
        System.out.println("Print Factorial " + product);
    }
}
