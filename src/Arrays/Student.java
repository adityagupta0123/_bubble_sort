package Arrays;
import java.util.Scanner;

public class Student {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Details s[] = new Details[3];
        int sum =0;
        for(int i=0;i<3;i++){
            s[i] = new Details();
            s[i].age=sc.nextInt();
            sum+=s[i].age;
        }
        System.out.println((float)sum/3);
    }

}
class Details{
    int age;
    int rollNo;
    int height;
}
