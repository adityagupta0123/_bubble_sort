package Arrays;

import java.util.Scanner;

    public class maxHeight {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int maxAge = 0;
            float mHeigth = 0;
            System.out.println("enter no. of student : ");
            int n = sc.nextInt();
            details s[] = new details[n];
            for(int i=0; i<n; i++){
                System.out.println("enter student details : ");
                s[i] = new details();
                s[i].age    = sc.nextInt();
                s[i].rollNo = sc.nextInt();
                s[i].height = sc.nextFloat();
            }
            for( int i=0; i<n; i++){
                if(s[i].height > mHeigth)
                    mHeigth = s[i].height;
                if(s[i].age > maxAge)
                    maxAge = s[i].age;
            }
            System.out.println("max heigtt is "+ mHeigth +" and max age is " + maxAge );

        }
    }
    class details{
        int age;
        int rollNo;
        float height;
    }


