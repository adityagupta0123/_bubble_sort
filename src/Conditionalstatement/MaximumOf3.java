package Conditionalstatement;

import java.util.Scanner;

public class MaximumOf3 {
    public static void main(String[]args){
        Scanner Number=new Scanner(System.in);
        System.out.println("enter frist no.");
        int a=Number.nextInt();
        System.out.println("enter second no.");
        int b=Number.nextInt();
        System.out.println("enter thrid no.");
        int c=Number.nextInt();
        int result =0;

//        if(a>b){
//            if (a>c){
//                result=a;
//            }else{
//                result=c;
//            }
//        }else{
//            if(b>c){
//                result=b;
//            }else{
//                result=c;
//            }
//        }

        result=c > ( a>b ? a:b) ? c:( (a>b ? a:b) ) ;

        System.out.println("largest no. is "+result);
    }
}
