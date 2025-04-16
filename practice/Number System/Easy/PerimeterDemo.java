import java.util.Scanner;

public class PerimeterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        CirclePerimeter circle = new CirclePerimeter();
        double perimeter = circle.calculatePerimeter(radius);

        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
