import java.util.Scanner;

public class recursiveSumOfnNaturalNumber {
    static int sum(int n){
        if (n==0){
            return 0;
        }
        else {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter ant number: ");
        int x = num.nextInt();
        System.out.println(sum(x));
    }
}
