//12. Write a Java program to check whether a given number is Armstrong 
 //Number or not.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Arm{
public static void main(String ar[]){
int a,r,ori,sum=0,co=0,ori1,p;
Scanner sc=new Scanner(System.in);
System.out.print("Enter multidigit number : ");
a=sc.nextInt();
ori=a;
ori1=ori;
while(a>0){
a=a/10;
co++;
}
while(ori>0){
r=ori%10;
p= (int)Math.pow(r,co);
sum=(sum+p);
ori=ori/10;
}
if(ori1==sum){
System.out.print(ori1 +" is an Armstrong number ");
}
else{
System.out.print(ori1+" is not an Armstrong number ");
}
sc.close();
}
}
