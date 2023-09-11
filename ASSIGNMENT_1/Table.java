//3. Write a Java program that takes a number as input and prints its 
//multiplication table up to 10
/*Author- Soumitra Das       Date-28/05/23*/

class Table{
public static void main(String args[]){
int a;
a=Integer.parseInt(args[0]);
for(int i=1;i<=10;i++){
System.out.println(a+" * "+i+" = "+(a*i));
}
}
}