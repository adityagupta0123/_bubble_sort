package Loops;

import java.util.Scanner;

public class PrimeNumberorNot {
    public static void main(String[]args){
        Scanner Number=new Scanner(System.in);

        System.out.println("enter no. to find prime no.");
        int adi = Number .nextInt();

        boolean isprime =true;

        for(int i=2; i<adi;i++){

            if(adi%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime) System.out.println("is prime number");
        else System.out.println("not a prime number");
    }
}
