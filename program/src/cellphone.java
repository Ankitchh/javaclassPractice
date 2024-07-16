import java.util.Scanner;
class phone {
    String phoneFunction ;
}

public class cellphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 if you phone is in not silent 2 if in vibrating mode or 3 if silent: ");
        int n = sc.nextInt();
        phone func = new phone();
        if (n==1){
            func.phoneFunction = "Ringing...";
        }
        else if (n==2){
            func.phoneFunction = "Vibrating...";
        }
        else if (n==3){
            func.phoneFunction = "Silent....";
        }
        else{
            System.out.println("Invalid Input!!!!");
            return;
        }
        System.out.println("Your phone is "+func.phoneFunction);
    }
}
