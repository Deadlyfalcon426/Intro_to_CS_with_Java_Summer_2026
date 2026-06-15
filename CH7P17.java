import java.util.Scanner;
public class CH7P17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num_student = read.nextInt();
        read.nextLine();
        String[] names = new String[num_student];
        double[] scores = new double[num_student];
        for(int i = 0;i<names.length;i++){
            System.out.print("Enter a student name: ");
            names[i] = read.nextLine();
            System.out.print("Enter a student score: ");
            scores[i] = read.nextDouble();
            read.nextLine();
        }
        System.out.println("Names in decreasing order of their scores are:");
        double current_max;
        int current_max_index;
        double temp;
        String temp_str;
        for(int i = 0; i<scores.length;i++){
            current_max = scores[i];
            current_max_index = i;
            for(int j = i;j<scores.length;j++){
                if(scores[j]>current_max){
                    current_max=scores[j];
                    current_max_index=j;
                }
            }
            temp = scores[i];
            scores[i] = scores[current_max_index];
            scores[current_max_index] = temp;

            temp_str = names[i];
            names[i] = names[current_max_index];
            names[current_max_index] = temp_str;
        }
        for(int i = 0; i<scores.length;i++){
            System.out.println(names[i]+" "+scores[i]);
        }
        
    }
}
