import java.util.*;
class Prime {
    public static void main(String argu[]){
        int count=0,i;
        System.out.println("Enter a number : ");
        Scanner inp=new Scanner(System.in);
        int n =inp.nextInt();
        System.out.println("All Prime number are : ");
        for( i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i);
            }

        }
        inp.close();

    }
}
