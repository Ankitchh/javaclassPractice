import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for pattern: ");
        int a = sc.nextInt();
        for(int i=0;i<=a;i++){
            for (int j=a-i;j>=1;j--){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
