//18. Write a Java program to find second highest element of //an array.
/*Author- Soumitra Das       Date-28/05/23*/
import java.util.*;
class High{
public static void main(String ar[]){
int a[];
int n,i,temp,h;
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of array : ");
n=sc.nextInt();
a=new int[n];
System.out.print("Enter an element one by one : ");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
sc.close();
}
for(i=0;i<n;i++){
for(int j=i;j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("Which highest element you want : ");
h=sc.nextInt();
System.out.print("Second highest number is : "+a[n-h]);
sc.close();
}
}