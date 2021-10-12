package Loops;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[]arg){
        Scanner multiply = new Scanner(System.in);

        System.out.println("enter number to write a table:");

        int tableof = multiply.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(tableof*i);
        }
    }
}
