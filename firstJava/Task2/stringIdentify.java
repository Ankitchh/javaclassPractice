import java.util.Scanner;
public class stringIdentify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any website url: ");
        String a = sc.nextLine();
        if (a.endsWith(".com")){
            System.out.println("It is an commercial website");
        }
        else if (a.endsWith(".org")){
            System.out.println("It is an organization website");
        }
        else if (a.endsWith(".in")){
            System.out.println("It is an Indian website");
        }
        else {
            System.out.println("Invalid input......");
        }
    }
}
