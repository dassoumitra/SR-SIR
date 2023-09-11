/*4. Write a program in Java to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance.*/
/*Author- Soumitra Das       Date-09/08/23*/

class Parent {
    void displayParent() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("single inheritance");
    }
}

class GrandChild extends Child {
    void displayGrandChild() {
        System.out.println("multilevel inheritance");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.displayParent();
        obj.displayChild();
        obj.displayGrandChild();
    }
}
