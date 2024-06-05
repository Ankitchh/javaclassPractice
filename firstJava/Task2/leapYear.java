import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = sc.nextInt();
        if(year%100==0){
            int x = year /100;
            if(x%4==0){
                System.out.printf("The year %d is a leap year",year);
            }
            else{
                System.out.printf("The year %d is not a leap year",year);
            }
        }
        else if(year%4==0){
            System.out.printf("The year %d is a leap year",year);
        }
        else{
            System.out.printf("The year %d is not a leap year",year);
        }
    }
}
