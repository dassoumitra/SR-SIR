//11. Write a Java program to display prime numbers between a given interval.
/*Author- Soumitra Das       Date-28/05/23*/

import java.util.*;
class Prime1 {
  public static void main(String[] args) {
    int si,ei;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter start index : ");
    si=sc.nextInt();
    System.out.print("Enter end index : ");
ei=sc.nextInt();
System.out.println("prime number in between "+si+" and "+ei+" are : ");
for (int i=si;i<=ei;i++){
  int co=0;
  for (int j=1;j<=i;j++){
    if (i%j==0){
      co++;
    }
  }
  if(co==2){
    System.out.print(i+" ");
  }
  
}

    sc.close();
  }
}

