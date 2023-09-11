//4. Write a Java program to convert an integer number to a binary number.
///*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Binary{
    public static void Deci_bina(int a){
     int r[];
     r=new int[20];
     int t=0;
     System.out.print("Binary form of "+a+" is = ");
     int i=0;
     while(a>0){
        r[i]=a%2;
        i++;
        a=a/2;
     }
     t=i-1;
     for(int j=t;j>=0;j--){
        System.out.print(r[j]);
     }
    }
public static void main(String ar[]){
int a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter an integer number = ");
a=sc.nextInt();
Deci_bina(a);
sc.close();

}
}

