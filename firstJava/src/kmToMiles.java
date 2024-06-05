import java.util.Scanner;
public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a distance in Km to convert it to Miles: ");
        float km= sc.nextFloat();
        System.out.println(km+" Km is equals to "+(km*0.6213f)+" Miles");
    }
}
