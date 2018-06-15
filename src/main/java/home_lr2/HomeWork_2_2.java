package home_lr2;

/**
 * Created by admin on 6/15/2018.
 */
import java.util.Scanner;

public class HomeWork_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        long num = in.nextLong();
        in.nextLine();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Сумма цифр числа равна " + Integer.toString(sum));

        //System.out.println("Press Enter to exit");
        //String z = in.nextLine();
    }
}

