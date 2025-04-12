public class hierarchial {
    public static void main(String[] args) {
       square  a = new square();
        a.area();  
        a.area(4);       

        circle c = new circle();
        c.area(); 
        c.area(4);
    }
}
// Parent class
class shape {
    void area() {
        System.out.println("the area of the shape is ");
    }
}

// Child class 1
class square extends shape {
    void area(int n) {
        System.out.println(n*n);
    }
}

// Child class 2
class circle extends shape {
    void area(int n) {
        System.out.println(3.14*n*n);
    }
}

