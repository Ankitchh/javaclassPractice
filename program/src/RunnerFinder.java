import java.util.Scanner;

public class RunnerFinder {

    public static int findFastestRunner(double[] times) {
        int fastestIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestIndex]) {
                fastestIndex = i;
            }
        }
        return fastestIndex;
    }

    public static int findSecondFastestRunner(double[] times) {
        int fastestIndex = findFastestRunner(times);
        int secondFastestIndex = -1;
        double secondFastestTime = Double.MAX_VALUE;

        for (int i = 0; i < times.length; i++) {
            if (i != fastestIndex && times[i] < secondFastestTime) {
                secondFastestTime = times[i];
                secondFastestIndex = i;
            }
        }
        return secondFastestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of runners: ");
        int numRunners = scanner.nextInt();

        String[] names = new String[numRunners];
        double[] times = new double[numRunners];

        for (int i = 0; i < numRunners; i++) {
            System.out.print("Enter the name of runner " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter the time of runner " + (i + 1) + " (in minutes): ");
            times[i] = scanner.nextDouble();
        }

        int fastestIndex = findFastestRunner(times);
        System.out.println("Fastest runner: " + names[fastestIndex] + " with a time of " + times[fastestIndex] + " minutes.");

        int secondFastestIndex = findSecondFastestRunner(times);
        if (secondFastestIndex != -1) {
            System.out.println("Second fastest runner: " + names[secondFastestIndex] + " with a time of " + times[secondFastestIndex] + " minutes.");
        } else {
            System.out.println("There is no second fastest runner.");
        }

        scanner.close();
    }
}
