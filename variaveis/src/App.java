public class App {
    public static void main(String[] args) throws Exception {
        // tipo nome
        // ? Tipos numericos inteiros

        // * Atribui um valor numerico de -127 até 128
        byte numeroPequeno = 50;

        // * Atribui um valor até 32767
        short numeroShort = -32767;

        // * Atribui numeros maiores
        int numeroMaior = 2147483647;

        // * Atribui numeros ainda maiores
        long numeroEnorme = 922337293685477000l;

        // ? Tipos numericos flutuantes
        float peso = 24.6f;

        double pi = 3.14153353463332321;

        // ? Tipos texto
        char letra = 'M';

        // ? Tipos numericos
        boolean estouComFome = true;

        String textoQualquer = "Ola meu nome é matheus";
        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroMaior);
        System.out.println(numeroEnorme);
        System.out.println(textoQualquer);
    }
}
