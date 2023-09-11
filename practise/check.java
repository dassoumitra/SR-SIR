import java.util.*;
class check{
public static void main(String args[]){
int no;
System.out.print("Enter your option : ");
Scanner sc =new Scanner(System.in);
no=sc.nextInt();
switch(no){
case 1: System.out.print("SUNDAY");
break;
case 2: System.out.print("MONDAY");
break;
case 3: System.out.print("TUSEDAY");
break;
case 4: System.out.print("WEDNESDAY");
break;
case 5: System.out.print("THURSEDAY");
break;
case 6: System.out.print("FRIDAY");
break;
case 7: System.out.print("SATURDAY");
break;
default: System.out.print("INVALID");
}
sc.close();
}
}
