package Array;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0; int b=1;
        int sum=a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
        for(int i=0;i<n;i++){
            a=b;
            b=sum;
            sum=a+b;

        }
        System.out.println(sum);
    }
    }

