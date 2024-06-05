import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int count=0;
        for(int i = 1; i <= a; i++)
        {
            if(a%i==0){
                count++;
                if(count>2){
                    break;
                }
            }

        }
        if(count==2){
            System.out.println(" Is prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
