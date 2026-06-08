import java.util.Scanner;
public class CH6P31 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")//the object 'read' always is complaining that its not being used, this is the only way i know to get it to shut up
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = read.nextLong();
        String truth;
        if(isValid(number)){
            truth="valid";
        } else{
            truth="invalid";
        }
        System.out.printf("%d is %s", number, truth);
    }

    public static boolean isValid(long number){
        if(getSize(number) < 13 || getSize(number) > 16)
            return false;

        if(!(prefixMatched(number, 4) ||
             prefixMatched(number, 5) ||
             prefixMatched(number, 6) ||
             prefixMatched(number, 37)))
            return false;

        return (sumOfDoubleEvenPlace(number) +
                sumOfOddPlace(number)) % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(long number){
        String num = Long.toString(number);
        int sum = 0;

        for(int i = num.length() - 2; i >= 0; i -= 2){
            int digit = num.charAt(i) - '0';
            sum += getDigit(digit * 2);
        }

        return sum;
    }
  
  //done
    public static int getDigit(int number){
        return (number/10>0)? (number/10)+(number%10) : number;
    }
  
  //done

    public static int sumOfOddPlace(long number){
        String num = Long.toString(number);
        int sum = 0;

        for(int i = num.length() - 1; i >= 0; i -= 2){
            sum += num.charAt(i) - '0';
        }

        return sum;
    }
    public static boolean prefixMatched(long number, int d){
        return getPrefix(number, getSize(d)) == d;
    }

  //done
    public static int getSize(long d){
        String dd = Long.toString(d);
        return dd.length();
    }
  
    public static long getPrefix(long number, int k){
        String num = Long.toString(number);

        if(num.length() <= k)
            return number;

        return Long.parseLong(num.substring(0, k));
    }
}
