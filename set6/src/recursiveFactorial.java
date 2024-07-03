import java.util.Scanner;
public class recursiveFactorial {
    static long factorial(long n){
        if (n==0||n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println("The factorial of given number is "+ factorial(x));
    }
}
