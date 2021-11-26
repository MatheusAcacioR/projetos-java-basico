import java.util.Random;
import java.util.Scanner;

// Gerando numeros aleatorios

public class App {
    public static void main(String[] args) throws Exception {
        // * Gerando um numero aleatorio entre 1 e 6 que sao as faces de um dado
        /* A classe Math gera um numero float entre 0.0 e 1.0, depois disso multiplica por 6 e 
        soma mais 1 pois o numero random pode ser 0.*/
        int FaceDoDado = 1 + (int) (Math.random() * 6);

        System.out.println(FaceDoDado);

        // * usando a classe random
        Random gerador1 = new Random();
        int numero = 1 + gerador1.nextInt(6);

        System.out.println(numero);

        // ? joguinho - Tirando uma face do dado
        Random gerador = new Random();
        Scanner faces = new Scanner(System.in);

        System.out.print("Quantas faces tem o dado? ");
        int inputFaces = faces.nextInt();
        int resultado = 1 + gerador.nextInt(inputFaces);

        System.out.format("A sua face do dado foi %d", resultado);
    }
}
