import java.util.Scanner;
public class sumOfEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int a= sc.nextInt();
        System.out.print("The sum of given numbers of first even numbers ");
        int b=0,i=1,x=0;
        while (i<=a){
            int ans=b+2;
            System.out.print(ans+", ");
            b=ans;
            x+=b;
            i++;
        }
        System.out.println("is "+x);
    }
}
