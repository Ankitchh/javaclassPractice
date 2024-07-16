import  java.util.Scanner;
class rectangle {
    int length;
    int breath;

    public int area (int length,int breath){
        return (length * breath);
    }
    public int perimeter (int length,int breath){
        return  2*(length+breath);
    }
}




public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle prop = new rectangle();
        System.out.print("Enter the length for the Square in meters: ");

        int n = sc.nextInt();
        System.out.print("Enter the breath for the Square in meters: ");
        int o = sc.nextInt();
        prop.length = n;
        prop.breath = o;
        System.out.println("Area of Square is "+prop.area(prop.length,prop.breath)+ (" m^2"));
        System.out.println("Perimeter of Square is "+prop.perimeter(prop.length,prop.breath)+ (" m"));
    }
}
