package home_lr1;

/**
 * Created by admin on 5/28/2018.
 */
public class HomeWork_1_2 {
    public static void main(String[] args) {

        int x = 45685;
        outputByChar(x);
    }

    public static void outputByChar(int x) {
        int a = x / 10000;
        int b = x / 1000 % 10;
        int c = x / 100 % 10;
        int d = x / 10 % 10;
        int e = x % 10;

        System.out.printf("%d%n%d%n%d%n%d%n%d%n%d",x,e,d,c,b,a);



    }
}
