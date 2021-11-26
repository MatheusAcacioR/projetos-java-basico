package controle;
import java.util.Scanner;
import dominio.PessoaFisica;
import dominio.PessoaJuridica;

public class Controle {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        read.useDelimiter("[\r\n]+");

        System.out.println("Digite o tipo do cliente");
        String tipoCliente = read.next();

        switch (tipoCliente) {
            case "fisica":
                System.out.println("Digite o nome da pessoa");
                String nomeCliente = read.next();
        
                
                System.out.println("Digite o telefone da pessoa");
                int telefoneCliente = Integer.parseInt(read.next());
                
                System.out.println("Digite o CPF da pessoa");
                String registroCliente = read.next();
                
                System.out.println("Digite o endereço da pessoa");
                String enderecoCliente;
                enderecoCliente = read.next();

                PessoaFisica pf = new PessoaFisica(enderecoCliente, telefoneCliente, registroCliente, nomeCliente);

                System.out.format("Nome da pessoa: %s\n", pf.getName());
                System.out.format("Endereço da pessoa: %s\n", pf.getAdress());
                System.out.format("Telefone da pessoa: %s\n", pf.getTelefone());
                System.out.format("CPF da pessoa: %s\n", pf.getCpf());
                break;

            case "juridica":
                System.out.println("Digite a razão social da empresa");
                String nomeEmpresa = read.next();
        
                
                System.out.println("Digite o telefone da empresa");
                int telefoneEmpresa = Integer.parseInt(read.next());
                
                System.out.println("Digite o CNPJ da empresa");
                String registroEmpresa = read.next();
                
                System.out.println("Digite o endereço da empresa");
                String enderecoEmpresa;
                enderecoEmpresa = read.next();

                PessoaJuridica pj = new PessoaJuridica(enderecoEmpresa, telefoneEmpresa, registroEmpresa, nomeEmpresa);
                
                System.out.format("Nome da empresa: %s\n", pj.getRazsoc());
                System.out.format("Endereço da empresa: %s\n", pj.getAdress());
                System.out.format("Telefone da empresa: %s\n", pj.getTelefone());
                System.out.format("CNPJ da empresa: %s\n", pj.getCnpj());
                break;

            default:
                System.out.println("Entrada invalida");
        }
            
        }
}