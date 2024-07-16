import  java.util.Scanner;
class Square {
    int side;

    public int area (int side){
       return side = side * side;
    }
    public int perimeter (int side){
        return  side = 4 * side;
    }
}

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square prop = new Square();
        System.out.print("Enter the Side for the Square in meters: ");

        int n = sc.nextInt();
        prop.side = n;
        System.out.println("Area of Square is "+prop.area(prop.side)+ (" m^2"));
        System.out.println("Perimeter of Square is "+prop.perimeter(prop.side)+ (" m"));
    }
}
