package SwitchStatement;

import java.util.Scanner;

public class Calculator {
       public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter frist no.");
        int a = sc.nextInt();

        System.out.println("enter second no.");
        int b = sc.nextInt();

        System.out.println("enter operator(+,-,/*):");

        char operator = sc.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("invaild operator.");
                return;

        }
        System.out.println("the result is " + a  + operator  + b +" = "+ result);


    }


}

