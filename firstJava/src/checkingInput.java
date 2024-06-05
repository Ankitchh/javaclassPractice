import java.lang.reflect.Type;
import java.util.Scanner;
public class checkingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number int or float: ");
        float a = sc.nextFloat();
        float b = a;
        int c = (int)a;
        System.out.println(c==b);
    }
}
