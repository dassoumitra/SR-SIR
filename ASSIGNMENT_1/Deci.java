//5. Write a Java program to convert a binary number to a //decimal number.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Deci{
public static void main(String ar[]){
int n,c=0,t_b=0,sum=0,ori,r,m,p;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Binary number : ");
n=sc.nextInt();
ori=n;
while(n>0){
n=n/10;
c++;
}
while(ori>0){
if(t_b<c){
r=ori%10;
p=(int)Math.pow(2,0+t_b);
m=r*p;
sum=sum+m;
t_b++;
ori=ori/10;
}
}
System.out.print("Decimal form is :"+sum);
sc.close();
}
}