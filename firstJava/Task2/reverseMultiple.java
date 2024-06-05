import java.util.Scanner;
public class reverseMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to find the multiple of: ");
        int a = sc.nextInt();
        int b= 0;
        for (int i =10;i>=1;i--){
            int ans= a*i;
            System.out.println(a+" * "+i+" = "+ans);
            b+=ans;
    }
        System.out.print("And the sum of its all multiple is: "+b);
}
}
