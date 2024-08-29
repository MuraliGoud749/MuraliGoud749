import java.util.Scanner;

public class Finanialforecasting {

    // Iterative method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        double futureValue = presentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the present value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (as a decimal): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter the number of periods (years): ");
        int periods = scanner.nextInt();

        // Calculate future value
        double futureValue = calculateFutureValue(presentValue, growthRate, periods);

        // Display result
        System.out.printf("The future value after %d periods is: %.2f\n", periods, futureValue);

        scanner.close();
    }
}
