import java.util.Scanner;
public class scrap2 {
    public static boolean isSorted(int[] list){
        int iterator = Integer.MIN_VALUE;
        for(int i = 0;i<list.length;i++){
            if(list[i]<iterator){
                return false;
            } else{
                iterator = list[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int l = read.nextInt();
        System.out.print("Enter the content of the list: ");
        int[] list = new int[l];
        for(int i = 0; i<l;i++){
            list[i] = read.nextInt();
        }
        System.out.print("The list has "+l+" integers: ");
        for(int i = 0; i<l;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println("");
        if(isSorted(list)){
            System.out.println("The list is already sorted");
        } else{
            System.out.println("The list is not sorted");
        }
    }
}
