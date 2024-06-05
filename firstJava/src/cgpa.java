import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float per = (a+b+c)/3;
        float cgpa = per/9.5F;
        System.out.println("You got "+cgpa+" CGPA");
    }
}
