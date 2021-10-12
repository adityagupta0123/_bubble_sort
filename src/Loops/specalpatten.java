package Loops;

import java.util.Scanner;

public class specalpatten {
    public static void main (String[]args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("enter no. to which patten write:");
        int n = Sc.nextInt();

        System.out.println("# ");

        for(int i =2; i <= n-1; i++) {

            System.out.print("# ");

            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("# ");
        }

            for (int i = 1; i <= n; i++) {
                System.out.print("# ");
            }
        }
    }

