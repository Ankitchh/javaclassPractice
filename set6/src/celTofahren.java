import java.util.Scanner;
public class celTofahren {

        public static double celsiusToFahrenheit(double celsius) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            return fahrenheit;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number in celsius to convert into fahrenheit: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        }
    }


