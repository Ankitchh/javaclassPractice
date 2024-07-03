import java.util.Scanner;
public class sumOfNaturalNumberByRecursive {
    static int sum (int a){

        if(a==0){
            return 0;
        }
        else {

    return a+sum(a-1);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       int y = sum(x);
        System.out.println(y);
    }
}
