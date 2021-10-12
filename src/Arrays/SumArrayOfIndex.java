package Arrays;

public class SumArrayOfIndex {
    public static void main (String[]args){
        int r[]={1,2,3,4,5,6};
        int sum=r[0];

        for(int i=1 ;i<=r.length; i++){
            sum+=r[i];
        }
        System.out.println(sum+" ");
    }
}
