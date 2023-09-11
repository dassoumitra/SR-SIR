//20. Reverse the elements in an array of integers without //using a second array.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Rev{
public static void main(String ar[]){
int a[];
int n,i,temp;
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
System.out.print("Second highest number is : "+a[n-2]);
/*for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}*/
System.out.print("\nReverse array is : ");
for(i=n-1;i>=0;i--){
System.out.print(a[i]+" ");
}
sc.close();
}
}