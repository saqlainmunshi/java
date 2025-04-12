
public class oops {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "blue";
        p1.type = "gel";
        p1.write();

        pen p2 = new pen();
        p2.color = "red";
        p1.write();
        p2.write();

    }
}

class pen {
    String color;
    String type;

    public void write() {

        System.out.println("something");
        System.out.println(this.color);
        System.out.println(this.type);

    }

}