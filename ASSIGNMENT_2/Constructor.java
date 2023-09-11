/*2. Write a program in Java to develop overloaded constructor. Also develop the copy constructor to create a new object with the state of the existing object.*/
/*Author- Soumitra Das       Date-09/08/23*/

class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "John";
        this.age = 20;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice", 22);
        Student student3 = new Student(student2);

        student1.display();
        student2.display();
        student3.display();
    }
}
