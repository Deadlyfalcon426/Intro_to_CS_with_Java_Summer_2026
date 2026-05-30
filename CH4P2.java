import java.util.Scanner;
public class CH4P2{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final double RADIUS = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double p1_lat = Math.toRadians(read.nextDouble());
        double p1_long = Math.toRadians(read.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double p2_lat = Math.toRadians(read.nextDouble());
        double p2_long = Math.toRadians(read.nextDouble());
        System.out.print("The distance between the two points is ");
        System.out.println(RADIUS*Math.acos( Math.sin(p1_lat)*Math.sin(p2_lat) + Math.cos(p1_lat)*Math.cos(p2_lat)*Math.cos(p1_long-p2_long) ));
    }
}