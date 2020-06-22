package Strings;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean res =false;
        if(a.length() != b.length()){
            res = false;
        }else {
            char[] ar1 = a.toCharArray();
            java.util.Arrays.sort(ar1);
            char[] ar2 = b.toCharArray();
            java.util.Arrays.sort(ar2);

            for(int i =0; i< ar1.length ; i++){
                if(ar1[i] != ar2[i]){
                    res = false;
                    break;
                }else {
                    res = true;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
