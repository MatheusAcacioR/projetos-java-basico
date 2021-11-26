package controle;
import java.util.Scanner;
import dominio.Diretor;
import dominio.Vendedor;

public class Controla {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        read.useDelimiter("[\r\n]+");

        System.out.println("Digite o tipo do funcionário[vendedor/diretor");
        String tipoFuncionario = read.next();

        switch (tipoFuncionario) {
            case "diretor":
                System.out.println("Digite a matricula do diretor");
                int matDiretor = Integer.parseInt(read.next());
        
                System.out.println("Digite o nome do diretor");
                String nomeDiretor = read.next();
                
                System.out.println("Digite o salario do diretor");
                float salaDiretor = Float.parseFloat(read.next());
                
                System.out.println("Digite a bonificação do diretor");
                float bonDiretor = Float.parseFloat(read.next());

                Diretor dir = new Diretor(matDiretor, nomeDiretor, salaDiretor, bonDiretor);

                System.out.format("Matricula do diretor: %s\n", dir.getMatricula());
                System.out.format("Nome do diretor: %s\n", dir.getName());
                System.out.format("Salario total do diretor: R$%.2f\n", dir.salarioTotal());
                break;

            case "vendedor":
                System.out.println("Digite a matricula do vendedor");
                int matVendedor = Integer.parseInt(read.next());
        
                System.out.println("Digite o nome do vendedor");
                String nomeVendedor = read.next();
                
                System.out.println("Digite o salario do vendedor");
                float salaVendedor = Float.parseFloat(read.next());
                
                System.out.println("Digite a comissao do vendedor");
                float comVendedor = Float.parseFloat(read.next());

                Vendedor ven = new Vendedor(matVendedor, nomeVendedor, salaVendedor, comVendedor);

                System.out.format("Matricula do vendedor: %s\n", ven.getMatricula());
                System.out.format("Nome do vendedor: %s\n", ven.getName());
                System.out.format("Salario total do vendedor: R$%.2f\n", ven.salarioTotal());
                break;

            default:
                System.out.println("Entrada invalida");
        }
    }
}