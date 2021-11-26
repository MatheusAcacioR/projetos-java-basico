package controle;

import java.util.Scanner;

import dominio.Curso;
import dominio.Professor;

public class Programa {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String matricula, cpf, name;

        System.out.println("CADASTRO DE CURSO");
        System.out.print("Digite o código: ");
        int codigo = read.nextInt();
        System.out.print("Digite a descrição: ");
        String descricao = read.next();

        Curso curso = new Curso(codigo, descricao);

        System.out.println("CADASTRO DE PROFESSORES");
        for (int i = 0; i <= 2; i++) {
            System.out.print("Digite a matricula: ");
            matricula = read.next();
            System.out.print("Digite o CPF: ");
            cpf = read.next();
            System.out.print("Digite o nome: ");
            name = read.next();
            Professor prof = new Professor(matricula, cpf, name);
            curso.addProf(prof);
        }
    }
}