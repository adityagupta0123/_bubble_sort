package whileloop;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter digit to sum of digit");

        int n= sc.nextInt();
        int temp= n;
        int sum= 0;

        while(temp>0){
            int lastdigit= temp%10;
            temp/= 10;

            sum+= lastdigit;

            System.out.println(lastdigit+" "+temp+" "+sum);
        }
        System.out.println("the sum of digit "+ n +" is "+ sum);

    }
}
