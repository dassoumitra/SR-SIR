//10. Write a Java program to check whether a number is prime or not
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
public class Prime {
    public static void main(String argu[]){
        int count=0;
        System.out.print("Enter a number : ");
        Scanner inp=new Scanner(System.in);
        int n =inp.nextInt();
        //System.out.print("All Prime number are : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }
     else{
        System.out.println(n+" is not a prime number");
     }
     inp.close();

    }
    
}
