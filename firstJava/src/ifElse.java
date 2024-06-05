import java.util.Scanner;
public class ifElse{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println(" enter the number");
        int ab = num.nextInt();

        if ( ab> 99 && ab<999) {
            System.out.println("its three digit number");
        }
        else if (ab <=99)
        {
            System.out.println(" its a two dig. no.");
        }
        else if (ab > 999){
            System.out.println("its not a three digit number");
        }
        else{
            System.out.println("invalid input");
        }
    }
}