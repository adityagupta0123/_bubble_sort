package Arrays;

import java.util.Scanner;

public class MarksOfStudent {
    public static void main(String[]args){
        Scanner num =new Scanner(System.in);
        System.out.println("enter  student no.of subject:" );

        int n= num.nextInt();
        int AverageMarks = 0;

        int Marks[] =new int[n];
        System.out.println("enter marks:");

        for(int i=0; i<n;i++){
            Marks[i]= num.nextInt();
        }

        for(int i=0; i<n; i++){
            AverageMarks += Marks[i];
        }
        AverageMarks /=n;
        System.out.println(AverageMarks);

    }
}
