import java.util.Scanner;
public class passFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avg = (a+b+c)/3;
        if (a>=33&&b>=33&&c>=33&&avg>=40){
            System.out.println("You're pass with "+avg+" %");
        }
        else{
            System.out.println("You're fail with "+avg+" %");
        }
    }
}
