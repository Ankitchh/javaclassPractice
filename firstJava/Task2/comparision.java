import java.util.Scanner;
public class comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 583;
        System.out.print("Enter random text to check weather you entered greater or less: ");
        int b = sc.nextInt();
        if (a>b){
            System.out.printf("Entered number %d is less then %d",b,a);
        }
        else{
            System.out.printf("Entered number %d is greater then %d",b,a);
        }
    }
}
