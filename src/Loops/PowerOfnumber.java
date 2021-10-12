package Loops;

import java.util.Scanner;

public class PowerOfnumber {
    public static void main(String[]args){
        Scanner Power = new Scanner(System.in);

        System.out.println("enter two number like[x,y=x^y]:");

        int a = Power.nextInt();
        int b = Power.nextInt();

        int result=1;

        for(int i=1; i<=b ; i++){
            result*=a;
        }
        System.out.println(result);

    }
}
