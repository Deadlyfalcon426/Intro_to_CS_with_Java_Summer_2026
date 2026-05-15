import java.util.Scanner;

public class CH2P13{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter monthly saving amount: "); double month_save = reader.nextDouble();
        double accumulator = 0;
        accumulator=(accumulator+month_save)*1.00417;
        System.out.println("After the first month, the account value is "+accumulator);
        accumulator=(accumulator+month_save)*1.00417; 
        System.out.println("After the second month, the account value is "+accumulator);
        accumulator=(accumulator+month_save)*1.00417;
        System.out.println("After the third month, the account value is "+accumulator);
        accumulator=(accumulator+month_save)*1.00417;
        accumulator=(accumulator+month_save)*1.00417;
        accumulator=(accumulator+month_save)*1.00417;
        System.out.println("After the sixth month, the account value is "+accumulator);
    }
}