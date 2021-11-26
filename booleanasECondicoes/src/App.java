public class App {
    public static void main(String[] args) throws Exception {
        // expresssoes booleanas
        int idade = 15;
        boolean resultado = idade == 18;
        // System.out.println(resultado);

        boolean estaChovendo = true;
        boolean guardaChuva = true;
        // condicionais
        if (estaChovendo && guardaChuva) {
            System.out.println("Nao esta molhando");
        } else {
            System.out.println("Esta molhando");
        }

        // operador condicional ternario
        String state = (estaChovendo && guardaChuva) ? "Nao esta molhado" : "Esta molhado";
        System.out.println(state);
    } 
}
