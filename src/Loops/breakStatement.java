package Loops;

import java.util.Scanner;

public class breakStatement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no:");

        for (; ; ) {
            int n = sc.nextInt();

            if (n < 0) {
                break;
            }
        }
    }
}
