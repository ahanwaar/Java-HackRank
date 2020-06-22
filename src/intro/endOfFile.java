package intro;

import java.util.Scanner;

public class endOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count =0;

        while(scan.hasNext()){
            count++;
            System.out.println(count+" "+scan.nextLine());

        }
    }
}
