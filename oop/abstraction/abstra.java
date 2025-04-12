

public class abstra {
    public static void main(String[] args) {
        Horse h = new Horse();
    h.walk();
    h.eating();
    }
}

abstract  class  Animal{

abstract void walk();
public void eating(){
    System.out.println("eating");
   
}

}

class Horse extends  Animal{
    public void walk(){
        System.out.println("Walking on 4 leg");
    }
}