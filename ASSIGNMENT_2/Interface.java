/*6. Write a program that illustrates interface inheritance. Interface P12 inherits from both P1 and P2. Each interface declares one constant and one method. The class Q implements P12. Instantiate Q and invoke each of its methods. Each method displays one of the constants.*/
/*Author- Soumitra Das       Date-09/08/23*/

interface P1 {
    int CONSTANT_P1 = 1;
    void methodP1();
}

interface P2 {
    int CONSTANT_P2 = 2;
    void methodP2();
}

interface P12 extends P1, P2 {}

class Q implements P12 {
    public void methodP1() {
        System.out.println("Constant from P1: " + CONSTANT_P1);
    }

    public void methodP2() {
        System.out.println("Constant from P2: " + CONSTANT_P2);
    }
}

public class Interface {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.methodP1();
        obj.methodP2();
    }
}
