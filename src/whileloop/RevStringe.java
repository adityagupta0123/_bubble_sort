package whileloop;

import java.util.Scanner;

public class RevStringe {
    public static void main(String[]args){
        Scanner num =new Scanner(System.in );
        System.out.println("enter string:" );

        String letter= num.nextLine();
        String reverse="";

        for(int i=letter.length()-1; i >=0 ; i--){
            reverse += letter.charAt(i);
        }

        if(letter.equals(reverse)){
            System.out.println("string "+letter+" is palindrome.");
        }else{
            System.out.println("string "+letter+" is not a palindrome.");
        }
    }
}
