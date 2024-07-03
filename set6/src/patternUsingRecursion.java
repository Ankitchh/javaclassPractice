import java.util.Scanner;

public class patternUsingRecursion {
    static void row(int n,int i){
        if(i<=n){
            col(i,1);
            System.out.println();
            row(n,i+1);

        }
    }


    static void col(int n,int j){
        if (j<=n){
            System.out.print("* ");
            col(n,j+1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for pattern: ");
        int a = sc.nextInt();
        row(a,1);
    }
}
