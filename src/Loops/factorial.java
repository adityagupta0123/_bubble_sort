package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[]args){

        Scanner Number = new Scanner(System.in);

        System.out.println("enter any number:");

        int fact= Number.nextInt();

        int n =1;

        for( int i=fact ; i>=1 ; i-- ){

            n = n*i;

        }
        System.out.println(n);
    }
}
