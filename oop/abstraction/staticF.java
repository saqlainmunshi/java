

class Student {
    static String college = "ABC University";  // Shared among all objects
    String name;  // Instance variable (different for each object)

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies at " + college);
    }
}

public class staticF {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();

        // Changing static variable affects all objects
        Student.college = "XYZ University";

        s1.display();
        s2.display();
    }
}
