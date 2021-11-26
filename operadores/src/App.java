public class App {
    public static void main(String[] args) throws Exception {
        int number1 = 10;
        int number2 = 23;

        int sum = number1 + number2;
        int dif = number1 - number2;
        int mult = number1 * number2;
        double div = (double) number1 / number2;
        int rest = number1 % number2;

        System.out.format("%d e %d somados é %d, subtraidos é %d, multiplicados é %d e divididos é %f e resto da divisao entre eles é %d", number1, number2, sum, dif, mult, div, rest);

        // * Aprendendo classe Math

        int numberA = 10;
        int numberB = -6;

        int absoluto = Math.abs(numberA);
        int pot = (int) Math.pow(numberA, numberB);

        // ! A classe Math possui diversas outras funções!!!

    }
}
