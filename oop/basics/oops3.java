

public class oops3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="saqlain";
        s1.age=23;
        Student s2 = new Student(s1);
        s2.print();
    }
}

class Student{
String name;
int age;
  void  print(){
    System.out.println(name);
    System.out.println(age);
}

Student(Student s) {
        this.name = s.name;
        this.age = s.age;

    }

    public Student() {
        System.out.println("hjhj");
    }
    




}