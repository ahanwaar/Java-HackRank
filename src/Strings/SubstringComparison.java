package Strings;

import java.util.Scanner;

public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.ArrayList<String> parts = new  java.util.ArrayList<>();

        for (int i = 0; i < s.length()-(k-1); i++) {
            String part = s.substring(i, k + i);
            parts.add(part);
        }
        java.util.Collections.sort(parts);
        smallest = parts.get(0);
        largest = parts.get(parts.size()-1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
