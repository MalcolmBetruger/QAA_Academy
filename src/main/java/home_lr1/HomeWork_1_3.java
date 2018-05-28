package home_lr1;

/**
 * Created by admin on 5/29/2018.
 */
public class HomeWork_1_3 {
    public static void main(String[] args) {

        int x1 = 0;
        int y1 = 0;
        int z1 = 0;

        int x2 = 3;
        int y2 = 3;
        int z2 = 3;
        vector(x1, y1, z1, x2, y2, z2);

    }

    public static void vector(int x1, int y1, int z1, int x2, int y2, int z2) {
        double result = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) + Math.pow((z2-z1), 2));

        System.out.printf("Длинна вектора: %f", result);

    }


}
