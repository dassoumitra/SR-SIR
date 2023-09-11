//7. Write a Java program to check whether a year is leap year or not
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Year{
public static void main(String arg[]){
int y;
Scanner sc=new Scanner(System.in);
System.out.print("Enter year : ");
y=sc.nextInt();
if((y%4==0&&y%100!=0)||y%400==0){
System.out.print("year is leap year ");
}
else{
System.out.print("year is not leap year ");

}
sc.close();
}
}
