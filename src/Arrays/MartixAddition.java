package Arrays;

import java.util.Scanner;

public class MartixAddition {
    public static void main(String[]args){
        Scanner num =new Scanner(System.in);

        System.out.println("'enter dimension:");

        int rows= num.nextInt();
        int cols= num.nextInt();

        int a[][]= new int[rows][cols];
        int b[][]= new int[rows][cols];

       // if(a[cols]==b[rows]) {

            System.out.println("enter array a:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    a[i][j] = num.nextInt();
                }
            }

            System.out.println("enter array b:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    b[i][j] = num.nextInt();
                }
            }
            int c[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    c[i][j] = a[i][j] * b[i][j];
                }
            }

            System.out.println("result sum of array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
       // else{
       //     System.out.println("invalid a[cols]!=b[rows].");
        //}

}
