public class single {
    public static void main(String[] args) {
        shape sh = new  shape();
        square s = new square();
        sh.color = "red";
        s.print();
       

    }
} 
// single level inheritance
class shape {
    String color;

}

class square extends shape {
    void print() {
        System.out.println(color);
    }

}
