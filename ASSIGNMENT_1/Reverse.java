//9. Write a Java program to reverse a number.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Reverse{
public static void main(String ar[]){
int a,r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter multidogit number: ");
a=sc.nextInt();
System.out.print("Reverse of a number is : ");
while(a>0){
r=a%10;
a=a/10;
System.out.print(r);
}
sc.close();
}
}