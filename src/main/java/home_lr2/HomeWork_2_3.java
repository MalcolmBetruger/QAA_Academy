package home_lr2;


/**
 * Created by admin on 6/15/2018.
 */
import java.util.Scanner;

public class HomeWork_2_3 {

    private static int calcDialogFor(int num) {
        if (num == 1)
            return 0;
        else return (num - 1) + calcDialogFor(num - 1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текущее количество программистов: ");
        int num = in.nextInt();
        in.nextLine();

        int count = calcDialogFor(num);
        System.out.print("Всего собеседований = "+Integer.toString(count));

    }
}

