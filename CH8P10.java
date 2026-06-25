
public class CH8P10 {
    public static void main(String[]args){
        int matrix[][] = new int[4][4];

        for(int i =0;i<4;i++){
            for(int j = 0; j<4;j++){
                //can be between 0 and 2, greater than 1 is about a 50% chance, then conditional chooses one
                matrix[i][j] = (Math.random()*2 >1)? 1 : 0;
                //why make a lot of for loops, we can print it right here
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        int greatest_column = -1;
        int greatest_row = -1;
        int greatest_column_sum = -1;
        int greatest_row_sum = -1;
        int current_column_sum;
        int current_row_sum;
        for(int i = 0; i<4; i++){
            current_column_sum=0;
            current_row_sum=0;
            for(int j = 0; j<4; j++){
                current_column_sum+=matrix[j][i];
                current_row_sum+=matrix[i][j];
            }
            if(current_column_sum>greatest_column_sum){
                greatest_column_sum=current_column_sum;
                greatest_column=i;
            }
            if(current_row_sum>greatest_row_sum){
                greatest_row_sum=current_row_sum;
                greatest_row=i;
            }
        }
        System.out.println("The largest row index: "+greatest_row);
        System.out.println("The largest column index: "+greatest_column);
    }
}