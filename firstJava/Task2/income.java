import java.util.Scanner;
public class income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        float inc = sc.nextFloat();
        if(inc<250000){
            System.out.println("income is "+inc+" and there is no tax for amount below 2.5lakhs");
        } else if (inc>=250000 && inc<=500000) {
            System.out.println("For the income of "+inc+" an employee pays 5% tax to govt which is Rs "+(inc*5/100));
        }
        else if (inc>=500000 && inc<=1000000) {
            System.out.println("For the income of "+inc+" an employee pays 20% tax to govt which is Rs "+(inc*20/100));
        }
        else {
            System.out.println("For the income of "+inc+" an employee pays 30% tax to govt which is Rs "+(inc*30/100));
        }

    }
}
