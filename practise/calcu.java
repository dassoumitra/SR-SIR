import java.util.*;
class calcu{
public static void main(String args[]){
int a,b,sum,sub,mul,divi,mod;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number : ");
a=sc.nextInt();
System.out.println("Enter the second number : ");
b=sc.nextInt();
sc.close();
sum=a+b;
mul=a*b;
divi=a/b;
mod=a%b;
sub=a-b;
System.out.println("Sum of "+a+" and "+b+" = "+sum );
System.out.println(" Subtraction of "+a+" and "+b+" = "+sub);
System.out.println(" Multipliction of "+a+" and "+b+" = "+mul);
System.out.println(" Division of "+a+" and "+b+" = "+divi);
System.out.println(" Reminder of "+a+" and "+b+" = "+mod);
}
}



