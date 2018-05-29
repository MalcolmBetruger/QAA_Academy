package home_lr1;

/**
 * Created by admin on 5/28/2018.
 */
public class HomeWork_1_1 {
    public static void main (String[]args) {


        double x = 343434;


        double y = 444;
        double z = 45657567;
        double n = 5555.55;



        System.out.printf("Результат первого уравнения (считаем в long): %d", longCalculation(x,y,z,n));
        System.out.printf("%nРезультат второго уравнения (считаем в int): %d", intCalculation(x,y,z,n));
        System.out.printf("%nРезультат третьего уравнения (считаем в float): %f", floatCalculation(x,y,z,n));
        System.out.printf("%nРезультат четвертого уравнения (считаем в double): %f", doubleCalculation(x,y,z,n));

    }
    public static long longCalculation (double x, double y, double z, double n){
        long result1 = (long) (x + (y - 100) * z / n);
        return result1;
    }

    public static int intCalculation (double x, double y, double z, double n){
        int result2 = (int) ((x - (50 + y * z) * n) + x);
        return result2;
    }

    public static float floatCalculation (double x, double y, double z, double n){
        float result3 = (float) (x * (y / (z-1) + 555) - n);
        return result3;
    }

    public static double doubleCalculation (double x, double y, double z, double n){
        double result4 = (double) (-x / y + z * (n+1));
        return result4;
    }


}
