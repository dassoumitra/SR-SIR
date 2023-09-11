import java.util.*;
public class even {
    public static void main(String argu[]){
        System.out.println("Enter a number : ");
        Scanner inp=new Scanner(System.in);
        int n =inp.nextInt();
        System.out.println("All even number is : ");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print( i+" " );
            }

        }
        inp.close();

    }
}
