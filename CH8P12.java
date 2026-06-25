import java.util.Scanner;

public class CH8P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},   // Single filer
            {16700, 67900, 137050, 208850, 372950}, // Married jointly
            {8350, 33950, 68525, 104425, 186475},   // Married separately
            {11950, 45500, 117450, 190200, 372950}  // Head of household
        };
        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er),");
        System.out.println(" 2-married separately, 3-head of household)");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        if (status < 0 || status > 3) {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = computeTax(brackets, rates, status, income);

        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }

    public static double computeTax(int[][] brackets, double[] rates, int status, double income) {
        double tax = 0;
        int[] bracket = brackets[status];

        // First bracket
        if (income <= bracket[0]) {
            return income * rates[0];
        }

        // Tax the first bracket fully
        tax += bracket[0] * rates[0];

        // Middle brackets
        for (int i = 1; i < bracket.length; i++) {
            if (income > bracket[i]) {
                tax += (bracket[i] - bracket[i - 1]) * rates[i];
            } else {
                tax += (income - bracket[i - 1]) * rates[i];
                return tax;
            }
        }

        // If income exceeds the last bracket
        tax += (income - bracket[4]) * rates[5];

        return tax;
    }
}
