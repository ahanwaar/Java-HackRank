package Strings;

import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) <= 0){
            System.out.println("No");
        }else System.out.println("Yes");
        System.out.println(capitalize(A) + " " + capitalize(B));
    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
