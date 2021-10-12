package Loops;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[]args){
        Scanner fib= new Scanner(System.in);

        System.out.println("enter no. to fibonacci : " );

        int Number = fib.nextInt();
        int a=0;
        int b=1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=0 ; i<=Number ; i++){

            int c=a+b;
            System.out.print(c+" ");

            a=b;
            b=c;

        }


    }
}
