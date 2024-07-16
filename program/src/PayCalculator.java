import java.util.Scanner;

public class PayCalculator {

    public static String calculatePay(double hoursWorked, double basePay) {

        final double MINIMUM_WAGE = 8.00;
        final double MAX_HOURS = 60;
        final double REGULAR_HOURS = 40;
        final double OVERTIME_MULTIPLIER = 1.5;

        if (basePay < MINIMUM_WAGE) {
            return "Error: Base pay is below the minimum wage.";
        }
        if (hoursWorked > MAX_HOURS) {
            return "Error: Hours worked exceed the maximum limit.";
        }


        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            double regularPay = REGULAR_HOURS * basePay;
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            double overtimePay = overtimeHours * basePay * OVERTIME_MULTIPLIER;
            totalPay = regularPay + overtimePay;
        }

        return "Total pay: $" + String.format("%.2f", totalPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter base pay: ");
        double basePay = scanner.nextDouble();
        String result = calculatePay(hoursWorked, basePay);
        System.out.println(result);

        scanner.close();
    }
}
