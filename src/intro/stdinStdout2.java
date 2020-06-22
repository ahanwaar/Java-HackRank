package intro;

import java.util.Scanner;

public class stdinStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String S = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + S);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
