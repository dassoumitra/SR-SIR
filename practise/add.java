//ADDITION TWO NUMBER.
import java.util.Scanner;
public class add {
    static public void main(String argu[]){
        int a,b,sub,mul,divi,mod;
        b=9;a=9;
        int sum=a+b;
        sub=a-b;
        mul=a*b;
        divi=a/b;
        mod=a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(divi);
        System.out.println(mod);
        Scanner inp = new Scanner (System.in);
        int c=inp.nextInt();
        sum=a+c;

        System.out.println("Sum of " +a+ " and " +c+ " = "+sub);
        inp.close();

    }
}
