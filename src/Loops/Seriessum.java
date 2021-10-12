package Loops;

import java.util.Scanner;

public class Seriessum {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter no. up which series add:");
        int  number= sc.nextInt();

        float result=0;

        for(float i=1;i<=number;i++){
            result=1/i;
        }
        System.out.println("sum of series is "+result);
    }
}
