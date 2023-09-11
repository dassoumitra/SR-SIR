/*2. Write a Java program that takes two numbers as input using command 
line arguments and displays the product of two numbers*/
/*Author- Soumitra Das       Date-28/05/23*/

class Mul{
public static void main(String args[]){
int x,y;
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);
System.out.print("x*y = "+(x*y));
}
}