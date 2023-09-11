/*8. Write a program in Java to demonstrate implementation of multiple inheritance using interfaces.*/
/*Author- Soumitra Das       Date-09/08/23*/

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MultipleInheritance implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method from Interface1");
    }

    public void method2() {
        System.out.println("Method from Interface2");
    }
}

public class Mul_inheritance {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.method1();
        obj.method2();
    }
}
