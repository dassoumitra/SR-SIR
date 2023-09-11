import java.util.*;
class swap{
void Swap(int x,int y){
System.out.print("Before swap \na= "+x+"\n b= "+y);
int temp;
temp=x;
x=y;
y=temp;
System.out.print("\nAfter swap \na= "+x+"\n b= "+y);
}
}
class swapto{

public static void main (String args[]){
swap s1=new swap();
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the 1st number: ");
a=sc.nextInt();
System.out.print("Enter the 2st number: ");
b=sc.nextInt();
s1.Swap(a,b);
sc.close();
}
}
