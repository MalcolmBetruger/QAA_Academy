package home_lr3;

/**
 * Created by admin on 6/18/2018.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_3_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        String fio = in.nextLine();

        System.out.println("Введите телефон:");
        String phone = in.nextLine();

        System.out.println("Введите email:");
        String email = in.nextLine();

        // Создаем паттерн и проверяем ФИО
        Pattern p1 = Pattern.compile("^[a-zA-Z -]*$");
        Matcher m1 = p1.matcher(fio);
        if (!m1.matches())
            System.out.println("Неверный ФИО: " + fio);

        // Создаем паттерн и проверяем телефон
        Pattern p2 = Pattern.compile("^\\+380\\d{9}$");
        Matcher m2 = p2.matcher(phone);
        if (!m2.matches())
            System.out.println("Неверный телефон: " + phone);

        // Создаем паттерн и проверяем email
        Pattern p3 = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+$");
        Matcher m3 = p3.matcher(email);
        if (!m3.matches())
            System.out.println("Неверный email: " + email);

    }
}
