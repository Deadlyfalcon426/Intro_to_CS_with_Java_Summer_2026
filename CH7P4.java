import java.util.Scanner;

public class CH7P4{
    public static void main(String[] args) {
        double[] array = new double[100];
        int counter = 0;
        double sum = 0;
        double input;
        Scanner read = new Scanner(System.in);
        
        while(1==1){
            System.out.print("Enter a new score: ");
            input = read.nextDouble();
            if(input<0){
                break;
            }
            array[counter] = input;
            counter++;
            sum+=input;
        }
        System.out.printf("Count is %d\n", counter);
        double avg = sum/counter;
        System.out.printf("Average is %.1f\n", avg);
        int num_over = 0;
        int num_under = 0;
        for(int i = 0; i<counter;i++){
            if(array[i]<avg){
                num_under++;
            } else{
                num_over++;
            }
        }
        System.out.println("Number of scores above or equal to the average is "+num_over);
        System.out.println("Number of scores below the average is "+num_under);

    }
}