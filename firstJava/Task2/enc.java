import java.util.Scanner;
public class enc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade between 1 to 100: ");
        int a = sc.nextInt();
        a += 8;
        int b =a;
        System.out.println("The encrypted grade is: "+a);
        System.out.println("The decrypted grade is: "+(b-8));
        sc.close();
    }
}
