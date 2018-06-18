package home_lr3;

/**
 * Created by admin on 6/18/2018.
 */
import java.util.Scanner;

public class HomeWork_3_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = in.nextLine();

        // Поиск слов, разбивая на пробелы
        String word = "";
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ') {
                // Печать очередного слова
                System.out.print(word + " ");
                word = "";
            }
            else  //Здесь автоматически переворачиваем слово, складывая символы в обратном порядке
                word = str.charAt(i) + word;
        System.out.println(word + " ");

    }
}

