/*7. Write an application that illustrates method overriding in the same package and different packages.*/

//pack2.SubClass:

//package pack2;
import pack1.Baseclass;

public class SubClass extends Baseclass {
    @Override
    public void display() {
        System.out.println("SubClass method");
    }
}

public class Package {
    public static void main(String[] args) {
        Baseclass obj1 = new Baseclass();
        obj1.display();

        Subclass obj2 = new Subclass();
        obj2.display();
    }
}
