package controle;
import java.util.Scanner;
import dominio.Aluno;


public class ControleAluno {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite a matricula: ");
        String matr = read.nextLine();

        System.out.print("Digite a nota do teste: ");
        String teste = read.nextFloat();

        System.out.print("Digite a nota da prova: ");
        String prova = read.nextFloat();

        Aluno al = new Aluno(matr, teste, prova);
        al.calculaMedia();

        System.out.println("Dados do cliente"); 
        System.out.format("Matricula: %s\n", al.getMatr());
        System.out.format("Media do aluno: %s", al.getMed());

    }
}
