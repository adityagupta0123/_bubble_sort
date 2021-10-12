package Loops;

import java.util.Scanner;

public class SumOfSeriesByAlternate {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter no. up which series add:");
        int  number= sc.nextInt();

        float result=0;

        for(float i=1;i<=number;i++) {
            if (i % 2 == 0) {
                result -= 1 / i;
            } else
                result += 1 / i;
        }

        System.out.println("sum of series is "+result);
    }
}
