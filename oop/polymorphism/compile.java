// compile time polymorphism is also called as fuction over  loading
public class compile {
    public static void main(String[] args) {
        
        poly p = new poly();
        p.name ="munshi";
        // p.age = 22;

        p.print("saqlain");
        p.print(23);
        p.print("saqlain",23 );
    }
}


class poly{
String name;
// int age;
    

void print(String name){
    System.out.println(this.name);
}
void print(String name,int age){
    System.out.println(name+" "+age);
}
void print(int age){
    System.out.println(age);
}




}
