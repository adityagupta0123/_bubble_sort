package Loops;

import java.util.Scanner;

public class horizontalprimate {
    public static void main (String[]args){
        Scanner Sc =new Scanner(System.in);

        System.out.println("enter no. to which patten write:");
        int n = Sc.nextInt();
        int rows = 2*n-1; //for no. of rows

        for(int i=1; i<=rows; i++ ){

            if(i<=n){
                for (int j=1; j<=i; j++) {
                    System.out.print("# ");
                }
            }else{
                for(int j=1; j<=rows-i+1; j++){
                    System.out.print("# ");
                }
            }
            System.out.println();
        }


    }
}
