package home_lr3;

/**
 * Created by admin on 6/18/2018.
 */

// !!!!!!!! НУЖНО ДОРАБОТАТЬ!!! ВЫВОДИТ ХЕРНЮ!!!!!
import java.util.Scanner;
import java.util.Random;

public class HomeWork_3_3  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива:");
        int size = in.nextInt();
        in.nextLine();

        // Создание и заполнение массива
        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++)
            arr[i]=rnd.nextInt(100);

        // Печать массива
        for (int i = 0; i < size; i++)
            System.out.print(Integer.toString(arr[i]) + " ");
        System.out.println("");

        // Вывод тех элементов, у которых кратность 3
        for (int i = 0; i < size; i++)
            if (arr[i] % 3 == 0)
                System.out.print(Integer.toString(arr[i]) + " ");
        System.out.println("");

    }
}
