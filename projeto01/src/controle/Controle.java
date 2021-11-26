package controle;
import java.util.Scanner;
import dominio.Vendedor;

public class Controle {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor");
        String nomeVendedor = read.next();

        System.out.println("Digite o salario do vendedor");
        float salarioVendedor = read.nextFloat();

        System.out.println("Digite a comissao do vendedor");
        float comissaoVendedor = read.nextFloat();
        

        Vendedor v1 = new Vendedor(nomeVendedor, salarioVendedor, comissaoVendedor);

        System.out.format("Nome do vendedor: %s\n", v1.getName());
        System.out.format("Salario do vendedor: R$%.2f\n", v1.totalPay());

    }
}
