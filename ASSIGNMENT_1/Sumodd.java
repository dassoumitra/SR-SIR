//19. Write Java program to find the sum of all odd //numbers in a array
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Sumodd{
public static void main(String ar[]){
int a[];
int n,i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of array : ");
n=sc.nextInt();
a=new int[n];
System.out.print("Enter an element one by one : ");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
sc.close();
}
System.out.print("Odd number are : ");
for(i=0;i<n;i++){
if(a[i]%2!=0){
sum=sum+a[i];
System.out.print(a[i]+" ");
}
}
System.out.print("\nSum of odd number = "+sum);
}
}
