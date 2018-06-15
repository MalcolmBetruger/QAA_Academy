package Practice_2;

import java.util.Random;

public class PasswordGenerator {

    private static final String SYMBOL_ALP = "!@#$%^&*";
    private static final String NUMBER_ALP = "0123456789";
    private static final String LETTER_ALP = "ABCDabcd";
    private static final int ALP_CHOOSE = 3;
    private static final int SYMB_GROUP = 0;
    private static final int NUMBER_GROUP = 1;
    private static final int LETTER_GROUP = 2;

    private Random rand = new Random();

    public String generate (int passLenght){

        StringBuilder pass = new StringBuilder();

        boolean hasSymbol = false;
        int digitCounter = 0;

        while (pass.length() != passLenght){
            int alpChoose = rand.nextInt(ALP_CHOOSE);
            switch (alpChoose){
                case SYMB_GROUP:
                    if (!hasSymbol) {
                        pass.append(chooseSymbol(SYMBOL_ALP));
                        hasSymbol = true;
                    }
                    break;

                case NUMBER_GROUP:
                    if (digitCounter < 3) {
                        pass.append(chooseSymbol(SYMBOL_ALP));
                        digitCounter ++;
                    }
                    break;

                case LETTER_GROUP:
                    pass.append(chooseSymbol(LETTER_ALP));
                break;
            }

        }
        return pass.toString();

    }

    private char chooseSymbol(String alp){
        int index = rand.nextInt(alp.length());
        return alp.charAt(index);
    }

    public static void main(String[] args) {

        PasswordGenerator generator = new PasswordGenerator();
        System.out.println(generator.generate(10));

    }


    }



