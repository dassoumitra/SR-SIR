/*5. Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.*/
/*Author- Soumitra Das       Date-09/08/23*/

class Parent {
    int value;

    Parent(int value) {
        this.value = value;
    }
}

class Child extends Parent {
    int childValue;

    Child(int parentValue, int childValue) {
        super(parentValue);
        this.childValue = childValue;
    }

    void displayValues() {
        System.out.println("Parent Value: " + value + ", Child Value: " + childValue);
    }
}

public class Subclass {
    public static void main(String[] args) {
        Child obj = new Child(10, 20);
        obj.displayValues();
    }
}
