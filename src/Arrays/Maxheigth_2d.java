package Arrays;

import java.util.Scanner;

public class Maxheigth_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAge = 0;
        float maxHeigth = 0;
        int n = sc.nextInt();
        details s1[][] = new details[n][3];
        for(int i=0; i<n ; i++){
            for(int j=0; j<3 ;j++ ){
                s1[i][j] = new details();
                s1[i][j].age    = sc.nextInt();
                s1[i][j].rollNo = sc.nextInt();
                s1[i][j].height = sc.nextFloat();
            }
        }
        for( int i=0; i<n; i++){
            for(int j=0; j<3 ; j++){
                if(s1[i][j].height > maxHeigth)
                    maxHeigth = s1[i][j].height;
                if(s1[i][j].age > maxAge)
                    maxAge = s1[i][j].age;
            }
        }
        System.out.println("max heigtt is "+ maxHeigth +" and max age is " + maxAge );
    }
}
