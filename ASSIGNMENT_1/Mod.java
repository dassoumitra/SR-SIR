//15.Write a Java program to calculate the modules of two //numbers without using any inbuilt modulus operator.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Mod{
public static void main(String ar[]){
int a,b,d,m,r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st number : ");
a=sc.nextInt();
System.out.print("Enter 2nd number : ");
b=sc.nextInt();
d=a/b;
m=d*b;
r=a-m;
System.out.print("Reminder of "+a+" and "+b+" is = "+r);
sc.close();
}
}