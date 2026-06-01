import java.util.Scanner;
public class CH5P5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
        //plotted the points given in desmos to find the actual relationship between the stuff so I only have to use one for loop
        for(int i = 1; i<=199;i++){
            System.out.printf("%d\t\t%f\t|\t%f\t%.2f\n", i, (i*2.2), ((i*2.5)+17.5), ((i*2.5)+17.5)*0.45445);
        }
    }
}
