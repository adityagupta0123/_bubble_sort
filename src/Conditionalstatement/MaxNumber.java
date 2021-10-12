package Conditionalstatement;

public class MaxNumber {

    public static void main(String[] args) {
        int a = 23;
        int b = 34;

        int result = 0;

//        if (a>b) {
//            result = a;
//        }else{
//            result = b;
//        }

// ##       result = Math.max(a, b);

        result=a>b?a:b;

        System.out.println("largest no.is "+result);
    }

}


