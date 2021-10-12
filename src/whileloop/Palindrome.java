package whileloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner Number= new Scanner(System.in);
        System.out.println("enter digit to check Palidrom:");

        int n = Number.nextInt();
        int temp= n;
        int rev= 0;

        while(temp>0){

            int lastdigit= temp%10;

            rev= rev*10+lastdigit;
            temp/=10;
        }
        if(rev==n){
            System.out.println(n+" is palidrom");
        }else{
            System.out.println(n+ " is not palidrom");
        }
    }
}
