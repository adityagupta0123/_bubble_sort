package Arrays;
import java.util.Scanner;

public class ModSumOfNUmber {
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter number to find single digit:");

        int num= Sc.nextInt();
        long mod = num%9;

        if(num>9){
            System.out.println(mod);
        }else{
            System.out.println(num);
        }

    }
}
