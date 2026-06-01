import java.util.Scanner;
public class CH5P9{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n_students = read.nextInt(); read.nextLine();
        double biggest=Double.MIN_VALUE;
        String biggest_name = "";
        double biggest_2 = Double.MIN_VALUE;
        String biggest_name_2 = "";
        String current_name = "";
        double current_score;
        for(int n = 0; n<n_students;n++){
            System.out.print("Enter a student name: ");
            current_name = read.nextLine();
            System.out.print("Enter a student score: ");
            current_score = read.nextDouble(); read.nextLine();
            if(current_score>biggest_2){
                if(current_score>biggest){
                    biggest_2 = biggest;
                    biggest_name_2 = biggest_name;
                    biggest = current_score;
                    biggest_name = current_name;
                } else{
                    biggest_2 = current_score;
                    biggest_name_2 = current_name;
                }
            }
        }
        System.out.println("Top two students:");
        System.out.println(biggest_name+"\'s score is "+biggest);
        System.out.println(biggest_name_2+"\'s score is "+biggest_2);
    }
}