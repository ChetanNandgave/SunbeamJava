import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();
        
        double addition=Arithmetic.add(num1, num2);
        double subtraction=Arithmetic.subtract(num1, num2);
        
        System.out.print("Addition="+addition);
        System.out.println("Subtraction="+subtraction);
        
        
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        
		double area = Geometry.rectangleArea(length, width);
        double perimeter = Geometry.rectanglePerimeter(length, width);

        System.out.println("\n--- Results ---");
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
        sc.close();
    }
}
