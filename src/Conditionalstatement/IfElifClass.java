package Conditionalstatement;

import java.util.Scanner;

public class IfElifClass {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int Number=sc.nextInt();

        if (Number<10){
            System.out.println("no. less than 10");
        }
        else if(Number>=10 && Number<=20){
            System.out.println("no.greater than 10 and less than 20");
        }
        else if(Number>=20 && Number<=30){
            System.out.println("no.greater than 20 and less than 30");
        }
        else{
            System.out.println("no. is greater than 30");
        }


    }

}
