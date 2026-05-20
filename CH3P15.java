import java.util.Scanner;
public class CH3P15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int lotNum = (int)(Math.random() * 1000);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = read.nextInt();
        System.out.println("The lottery number is " + lotNum);
        if (lotNum == guess) {
            System.out.println("Exact match: you win $10,000");
        }
        else {
            int lotNum_dig1 = lotNum / 100;
            int lotNum_dig2 = (lotNum % 100) / 10;
            int lotNum_dig3 = lotNum % 10;

            int guess_dig1 = guess / 100;
            int guess_dig2 = (guess % 100) / 10;
            int guess_dig3 = guess % 10;
            //since theres like so many ways it could go (3*3 = 9 permutations), we had to do it bunch of times...
            //actually since having all the boolean expressions looks ugly, im going to condense them into variables to save my sanity
            boolean dig1_dig1 = guess_dig1 == lotNum_dig1;
            boolean dig1_dig2 = guess_dig1 == lotNum_dig2;
            boolean dig1_dig3 = guess_dig1 == lotNum_dig3;
            boolean dig2_dig1 = guess_dig2 == lotNum_dig1;
            boolean dig2_dig2 = guess_dig2 == lotNum_dig2;
            boolean dig2_dig3 = guess_dig2 == lotNum_dig3;
            boolean dig3_dig1 = guess_dig3 == lotNum_dig1;
            boolean dig3_dig2 = guess_dig3 == lotNum_dig2;
            boolean dig3_dig3 = guess_dig3 == lotNum_dig3;
            if (
                (dig1_dig1 &&
                 dig2_dig2 &&
                 dig3_dig3)
                ||
                (dig1_dig1 &&
                 dig2_dig3 &&
                 dig3_dig2)
                ||
                (dig1_dig2 &&
                 dig2_dig1 &&
                 dig3_dig3)
                ||
                (dig1_dig2 &&
                 dig2_dig3 &&
                 dig3_dig1)
                ||
                (dig1_dig3 &&
                 dig2_dig1 &&
                 dig3_dig2)
                ||
                (dig1_dig3 &&
                 dig2_dig2 &&
                 dig3_dig1)
            ) {
                System.out.println("Match all digits: you win $3,000");
            }
            else if (
                dig1_dig1 ||
                dig1_dig2 ||
                dig1_dig3 ||
                dig2_dig1 ||
                dig2_dig2 ||
                dig2_dig3 ||
                dig3_dig1 ||
                dig3_dig2 ||
                dig3_dig3
            ) {
                System.out.println("Match one digit: you win $1,000");
            }
            else {
                System.out.println("Sorry, no match");
            }
        }
    }
}