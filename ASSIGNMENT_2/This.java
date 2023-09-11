/*1. Write a program in Java to demonstrate use of this keyword. Check whether this can access the private members of the class or not.java*/
/*Author- Soumitra Das       Date-09/08/23*/

class MyClass {
    private int number;

    public MyClass(int number) {
        this.number = number;
    }

    public void displayNumber() {
        System.out.println("Number: " + this.number);
    }
}

public class This {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        obj.displayNumber();
    }
}
