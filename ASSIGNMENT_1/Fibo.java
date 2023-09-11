//8. Write a Java program for Fibonacci series.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Fibo{
public static void main(String arg[]){
int a,b,f,n;
a=0;
b=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter term of fibonacci series: ");
n=sc.nextInt();
System.out.print(a+" "+b+" ");
for(int i=1;i<n-1;i++){
f=a+b;
a=b;
b=f;
System.out.print(f+" ");
}
sc.close();
}

}