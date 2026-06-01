import java.util.Scanner;
public class CH5P21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter loan amount, for example 120000.95: ");
        double loan = read.nextDouble();
        System.out.print("Enter number of years as an integer,\n for example 5: ");
        int years = read.nextInt();
        System.out.println("");
        System.out.println("Interest Rate       Monthly Payment     Total Payment");
        //the like double accumulation error happened right below
        for (double rate = 0.05; rate < 0.08125; rate += 0.00125) {
            double monthlyRate = rate / 12;
            double monthlyPayment = loan * monthlyRate /(1 - 1 / Math.pow(1 + monthlyRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%.3f%%%14s%-20.2f%-20.2f\n", (rate * 100), "" , monthlyPayment, totalPayment);
        }
    }
}
