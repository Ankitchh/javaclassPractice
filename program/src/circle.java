import  java.util.Scanner;
class Circle {
   final double pi = 3.141;
    double radius;

    public double area ( double radius){
        return (pi * radius * radius);
    }
    public double perimeter (double radius){
        return  2*(pi * radius);
    }
}

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle prop = new Circle();
        System.out.print("Enter the radius for the circle in meters: ");

        double n = sc.nextDouble();

        prop.radius = n;

        System.out.println("Area of circle is "+prop.area(prop.radius)+ (" m^2"));
        System.out.println("Perimeter of circle is "+prop.perimeter(prop.radius)+ (" m"));
    }
}
