/*3. Write a program in Java to demonstrate the use of 'final' keyword in the field declaration. How it is accessed using the objects.*/
/*Author- Soumitra Das       Date-09/08/23*/

class Constants {
    public final int VALUE = 10;
}

public class Final {
    public static void main(String[] args) {
        Constants obj = new Constants();
        System.out.println("Value: " + obj.VALUE);
    }
}