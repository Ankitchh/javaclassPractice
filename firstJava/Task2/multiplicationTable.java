import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to find the multiple of: ");
        int a = sc.nextInt();
        for (int i =1;i<=10;i++){
            int ans= a*i;
            System.out.println(a+" * "+i+" = "+ans);
        }
    }
}
