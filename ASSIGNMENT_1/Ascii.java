//13. Write a Java program to print the ASCII value of a given character.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Ascii{
public static void main(String as[]){
char ch;
System.out.print("Enter any character : ");
Scanner sc = new Scanner(System.in);
ch=sc.next().charAt(0);
int a=ch;
System.out.print("Ascii value of "+ch+" is = "+a);
sc.close();
}
}