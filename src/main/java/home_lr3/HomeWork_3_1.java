package home_lr3;

/**
 * Created by admin on 6/18/2018.
 */

import java.util.Scanner;

public class HomeWork_3_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = in.nextLine();

        // Проверка палиндрома путем сравнения символов от начала до конца
        boolean check = true;
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) check = false;

        if (check) {
            System.out.println("ДА");
        }
        else {
            System.out.println("НЕТ");
        }

    }
}
