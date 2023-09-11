//17. Write a Java program to check if a positive number is //a palindrome or not
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Palin{
public static void main(String ar[]){
int a,r,ori,s=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter any multidigit number : ");
a=sc.nextInt();
ori=a;
while(a>0){
r=a%10;
s=r+(s*10);
a=a/10;
}
if(s==ori){
System.out.print(ori+" is a palindrom number");
}
else
System.out.print(ori+" is not a palindrom number");
sc.close();
}
}