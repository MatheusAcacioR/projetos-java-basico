public class App {
    public static void main(String[] args) throws Exception {
        String filme = "Vingadores"; // %s
        int lancamento = 2010; // %d
        float nota = 9.5f; // %f
    
        System.out.println("O filme " + filme + " foi lançado em " + lancamento + " e possui a nota de " + nota);
        System.out.format("O filme %s foi lançado em %d e possui a nota de %f\n", filme, lancamento, nota);
        System.out.println("");
        String texto = "O filme " + filme + " foi lançado em " + lancamento + " e possui a nota de " + nota;
        String texto2 = String.format("O filme %s foi lançado em %d e possui a nota de %f", filme, lancamento, nota);

        System.out.println(texto);
        System.out.println(texto2);
        System.out.println("");

        String name = "Matheus ";
        String secondName = "Acacio ";
        String lastName = "Rodrigues ";

        String completeName = name + secondName + lastName;

        System.out.println(completeName);
    }
}
