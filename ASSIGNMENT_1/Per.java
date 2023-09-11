//14. Write a Java program for following grading system. 
//Note: Percentage>=90% : Grade A Percentage>=80% : 
//Grade B Percentage>=70% : Grade C Percentage>=60% :
//Grade D Percentage>=40% : Grade E
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Per{
public static void main(String ar[]){
int per;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your percentage : ");
per=sc.nextInt();
if(per>=90){
System.out.print("Grade A");
}
else if(per>=80){
System.out.print("Grade B");
}
else if(per>=70){
System.out.print("Grade C");
}
else if(per>=60){
System.out.print("Grade D");
}
else if(per>=40){
System.out.print("Grade A");
}
sc.close();
}
}

