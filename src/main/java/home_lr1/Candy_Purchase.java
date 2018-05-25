package home_lr1;

/**
 * Created by admin on 5/25/2018.
 */
public class Candy_Purchase {
    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        double coockiePrice = 15;
        double candyPrice = 20;

        double summ = (coockiePrice * 0.3) + (candyPrice * 0.4);
        double summ2 = 3 * ((coockiePrice * 2) + (candyPrice * 1.8));

        System.out.printf("Сумма покупки 300г печенья и 400г конфет равно %f денег", summ);
        System.out.printf("%nА сумма покупки 3-х покупок из 2кг печенья и 1.8кг конфет равно %f денег", summ2);
    }
}
