package home_lr2;

/**
 * Created by admin on 6/15/2018.
 */



import java.util.Scanner;

public class HomeWork_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число пробелов: ");
        int space = in.nextInt() ; in.nextLine();

        int h = space / 3;

        for (int i=0; i<5 + space * 4; i++)
            System.out.print("*");
        System.out.println();

        for (int j=0; j<4; j++) {

            for (int q=0; q<h; q++) {

                for (int i=0; i<4; i++) {
                    System.out.print("*");
                    for (int k=0; k < space; k++)
                        System.out.print(" ");
                }
                System.out.println("*");

            }

            for (int i=0; i<5 + space * 4; i++)
                System.out.print("*");
            System.out.println();

        }
    }
}