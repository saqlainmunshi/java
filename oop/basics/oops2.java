public class oops2 {
    public static void main(String[] args) {
        Student s1 = new Student("saqlain",23);
        s1.print();
        // s1.name = "saqlain";
        // s1.age = 22;
    }
}

class Student {
    String name;
    int age;

    public void print() {
        System.out.println(name);
        System.out.println(age);
    }
    
    // Student() {
        // System.out.println("constructor");
        // }
        Student(String n , int a) {
            System.out.println("constructor");
            name = n;
            age = a;
            System.out.println(name);
            System.out.println(age);
    }

}