import java.util.Scanner;
public class CH4P23 {
    public static void main(String[] args) {
        Scanner read_obj = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String nam = read_obj.nextLine();
        
        System.out.print("Enter number of hours worked in a week: ");
        double hours = read_obj.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double rate_pay = read_obj.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: ");
        double rate_tax_fed = read_obj.nextDouble();
        
        System.out.print("Enter state tax withholding rate: ");
        double rate_tax_state = read_obj.nextDouble();

        System.out.println("Employee Name: "+nam);
        System.out.println("Hours Worked: "+hours);
        System.out.println("Pay Rate: $"+rate_pay);
        System.out.println("Gross Pay: $"+rate_pay*hours);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding (%.2f%%):  $%.2f\n", rate_tax_fed*100, rate_pay*hours*rate_tax_fed);
        System.out.printf("\tState Withholding (%.2f%%):  $%.2f\n", rate_tax_state*100, rate_pay*rate_tax_state*hours);
        System.out.printf("\tTotal Deduction:  $%.2f\n",(rate_pay*hours*rate_tax_fed + rate_pay*hours*rate_tax_state));
        double total = rate_pay*hours - rate_pay*hours*rate_tax_fed - rate_pay*hours*rate_tax_state;
        System.out.printf("Net Pay:   $%.2f", total);
    }
}
