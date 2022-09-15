package Recursion;

public class sumRecursion {
    public static int sum(int n){                        //n=5
        if(n==0){                   // Base case          5==0
            return 0;
        }
        return n+sum(n-1);                            // 5+sum(5-1)=5+4+3+2+1=15
    }
    public static void main(String[] args) {
        System.out.println("Recursive sum " +sum(5));
    }
}
