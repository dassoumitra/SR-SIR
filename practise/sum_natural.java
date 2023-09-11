import java.util.*;
public class sum_natural {
    public static void main (String arus[]){
        int sum=0;
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of fisrt natural number upto "+n+" = "+sum);
        in.close();
    }
   
}
