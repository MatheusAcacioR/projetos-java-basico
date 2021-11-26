// ! Lendo um input do usuario e imprimindo na tela
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // * Numero inteiro
        int idade;
        // Scanner -> Classe
        Scanner inputIdade = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = inputIdade.nextInt();

        System.out.println("A idade é " + idade);

        // * Numero flutuante
        float nota;
        Scanner inputNota = new Scanner(System.in);
        nota = inputNota.nextFloat();
        System.out.println("Digite sua nota");
        
        System.out.println("Sua nota é " + nota);

        // * String
        String jogo;
        // Criando um objeto jogoFavorito para ler valores de input do usuario
        Scanner jogoFavorito = new Scanner(System.in);

        // Definindo que os separadores é ; OU \r OU \n
        jogoFavorito.useDelimiter("[;\r\n]");
        System.out.println("Qual o seu jogo favorito? ");

        jogo = jogoFavorito.next();

        System.out.println("Meu jogo favorito é " + jogo);
        System.out.println("");

        // * String - Utilizando o nextLine
        String jogo2;
        Scanner jogoMenosFavorito = new Scanner(System.in);
        jogoFavorito.useDelimiter("[;\r\n]");
        System.out.println("Qual o seu jogo menos favorito? ");

        jogo2 = jogoMenosFavorito.nextLine();

        System.out.println("Meu jogo menos favorito é " + jogo2);

        // * Usando interface grafica
        String filme = JOptionPane.showInputDialog(null, "Qual o seu filme favorito?", "Aprendendo Java - Inputs", JOptionPane.QUESTION_MESSAGE);
        String anoFilme = JOptionPane.showInputDialog(null, "De que ano é o filme?");

        // convertendo uma string em inteiro
        int ano = Integer.parseInt(anoFilme);

        System.out.println(filme);
        System.out.println(ano);
    }
}
