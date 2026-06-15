public class Exam1AM {
    public static void main(String[]args){
        System.out.println("Product\t\tOunces\t\tOunces\t\tPercentage");
        System.out.println("Number\t\tProduct\t\tWater\t\tWater\t\tRating");
        System.out.println("=======\t\t=======\t\t=======\t\t==========\t==========");
        int water_variable;
        for(int num = 10010; num<=10100;num+=10){
            water_variable = random_water();
            System.out.printf("%d\t\t%d\t\t%d\t\t%.1f\t\t%s\n", num, oz_product(water_variable), water_variable, get_percent(water_variable), get_rating(get_percent(water_variable)));
        }
    }
    public static int random_water(){
        return (int)(Math.random()*20)+1;
    }
    public static double get_percent(int oz_water){
        return oz_water/64.0*100;
    }
    public static String get_rating(double oz_percent){
        oz_percent /= 100;
        if (oz_percent<=0.05){
            return "Excellent";
        } else if(oz_percent<=0.15){
            return "Acceptable";
        } else{
            return "Poor";
        }
    }
    public static int oz_product(int water){
        return 64-water;
    }
}
