//6. Write a Java program and compute the sum of an integer's digits.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Digi_sum{
public static void main(String args[]){
int a,d_s=0,r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter an multidigit integer = ");
a=sc.nextInt();
while(a>0)
{
r=a%10;
d_s=d_s+r;
a=a/10;
}
System.out.println("Sum of digits = "+d_s);
sc.close();
}

}