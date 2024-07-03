import java.util.Scanner;
public class sumOfnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int a = sc.nextInt();
        System.out.print("The sum of given numbers ");
        int b = 0, i = 1, x = 0;
        if (a == 0) {
            System.out.println("is " + x);
        }
        else {
            while (0 <= a) {
                int ans = b + a;
                b = ans;
                a--;
                i++;
                x=ans;
            }
            System.out.println("is " + x);
        }
    }
}
