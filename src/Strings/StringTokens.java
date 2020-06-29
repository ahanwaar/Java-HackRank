package Strings;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length() <= 400000){
            if(s.trim().length() == 0){
                System.out.println(0);
            }else {
                String[] tokens = s.trim().split("[!,?._'@\\s]+");
                System.out.println(tokens.length);
                for(int i=0; i<tokens.length; i++){
                    System.out.println(tokens[i]);
                }
            }
        }
        scan.close();
    }
}
