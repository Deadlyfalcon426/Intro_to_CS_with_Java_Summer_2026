import java.util.Scanner;
public class CH6P7 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years){
        return investmentAmount*Math.pow(1+monthlyInterestRate, years*12);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("The amount invested: "); double invAmount = read.nextDouble();
        System.out.print("Annual interest rate: "); double rate_month = read.nextDouble()/12/100;
        System.out.println("Years\tFuture Value");
        for(int y = 1; y<=30; y++){
            System.out.printf( "%d\t%12.2f\n", y, futureInvestmentValue(invAmount, rate_month, y));
        }
    }
}
