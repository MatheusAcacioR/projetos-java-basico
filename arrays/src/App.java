import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // ? Fazendo um array
        // tipo[] nomeVariavel = new tipo[]
        String[] nomes = new String[] {
            "teste", "teste2", "teste3"
        };

        for (int posicao = 0; posicao < 3; posicao++) {
            System.out.format("%s\n", nomes[posicao]);
        }

        // ? Array de numeros 
        int[] numeros = new int[100];

        // Preencher o array com um valor
        Arrays.fill(numeros, -1);

        System.out.println(Arrays.toString(numeros));

        // ? Preenchendo array com for
        int[] num = new int[10];

        for (int posicao = 0; posicao < num.length; posicao++) {
            num[posicao] = posicao + 1;
        }
        System.out.println(Arrays.toString(num));
    }
}
