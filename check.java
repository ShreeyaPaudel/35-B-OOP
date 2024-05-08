import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println(" Circle");
        System.out.println(" Rectangle");
        System.out.println(" Square");
        System.out.println(" Triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of circle: " + circleArea);
                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of rectangle: " + rectangleArea);
                break;
            case 3:
                System.out.print("Enter side length of square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of square: " + squareArea);
                break;
            case 4:
                System.out.print("Enter base length of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the of triangle: ");
                double height = scanner.nextDouble();
                double triArea = 0.5 * base * height;
                System.out.println("Area of triangle: " + triArea);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
