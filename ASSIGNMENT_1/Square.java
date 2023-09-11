//16.Write a Java program to calculate the square root of a //number without using any inbuilt method
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Square{
public static void main(String ar[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number : ");
n=sc.nextInt();
sc.close();
squareroot(n);
}
public static void squareroot(int num){
double t;
double sr=num/2;
do{
t=sr;
sr=(t+(num/t))/2;
}while((t-sr)!=0);
System.out.print("Square root is : "+sr);
}
} 