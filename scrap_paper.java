import java.util.Scanner;
public class scrap_paper {
    public static String grade(int score, int best){
        if(score>=best-10){
            return "A";
        } else if(score>=best-20){
            return "B";
        } else if(score>=best-30){
            return "C";
        } else if(score>=best-40){
            return "D";
        } else{
            return "F";
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        System.out.print("Enter "+num+" scores: ");
        int[] scores = new int[num];
        for(int i =0;i<num;i++){
            scores[i] = read.nextInt();       
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<num;i++){
            if(max<scores[i]){
                max=scores[i];
            }
        }
        for(int i = 0;i<num;i++){
            System.out.printf("Student %d score is %d and grade is %s\n", i, scores[i], grade(scores[i], max));
        }

    }
    

  
}
