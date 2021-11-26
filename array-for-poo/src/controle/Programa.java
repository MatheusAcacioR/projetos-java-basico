package controle;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] nomes = new String[10];
       
        for (int i = 0; i < nomes.length; i++) {
        System.out.print("Digite um nome: ");
        nomes[i] = leia.next();
        }
       
        System.out.println("Nomes que tem mais de 7 letras: ");
        for (int i = 0; i < nomes.length; i++)
        if (nomes[i].length() > 7)
        System.out.println(nomes[i]);
       
        System.out.println("Nomes que começam com a letra M:");
        for (int i = 0; i < nomes.length; i++)
        if (nomes[i].charAt(0) == 'M')
        System.out.println(nomes[i]);
       
        System.out.println("Nomes que terminam com a letra a: ");
        for (int i = 0; i < nomes.length; i++)
        if (nomes[i].charAt(nomes[i].length() - 1) == 'a')
        System.out.println(nomes[i]);
       }
}
