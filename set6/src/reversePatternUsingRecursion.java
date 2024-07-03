import java.util.Scanner;

public class reversePatternUsingRecursion {
    static void row(int n,int i){
        if(i<=n){
            col(1,n-i);
            System.out.println();
            row(n,i+1);

        }
    }


    static void col(int n,int j){
        if (j>=1){
            System.out.print("* ");
            col(n,j-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for pattern: ");
        int a = sc.nextInt();
        row(a,0);
    }
}
