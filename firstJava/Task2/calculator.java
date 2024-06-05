import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers and Operation you want to perform.. (+,-,/,*,%).. then second number");
        float a = sc.nextFloat();
        char c = sc.next().charAt(0);
        float b = sc.nextFloat();
        do {
            if (c == '+') {
                System.out.println(a =(a + b));
            } else if (c == '-') {
                System.out.println(a =(a - b));
            } else if (c == '*') {
                System.out.println(a =(a * b));
            } else if (c == '/') {
                System.out.println(a =(a / b));
            } else if (c == '%') {
                System.out.println(a =(a % b));
            }
            else {
                System.out.println("Enter a valid operation");
            }
            System.out.println("Enter Operation you want to perform.. (+,-,/,*,%) and  next numbers..");
            System.out.println(" or press 0 to exit");
            c = sc.next().charAt(0);
            if(c=='0'){ break;}
            b = sc.nextFloat();
        } while (true);
    }
}
