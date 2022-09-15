package String;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str){
        if(str == null || str.length()<=1){
            return str;
        }

        return reverse(str.substring(1))+str.charAt(0);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}