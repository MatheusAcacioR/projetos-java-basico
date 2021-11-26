public class App {
    public static void main(String[] args) throws Exception {
        // ! repetição com while
       int contador = 0;
       int mult = 2;
       while (contador <= 10) {
           // int resultado = contador * mult;
           System.out.format("%d x %d = %d\n", mult, contador, contador * mult);
           contador++;
       }

       // ! repetição com for
       for (int cont = 0; cont <= 10; cont++) {
           int multi = 2;
           System.out.format("%d x %d = %d\n", multi, cont, multi * cont);
       }
    }
}
