import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Double> notas = new LinkedList<Double>();
        Scanner sc = new Scanner(System.in);
        
        boolean scape = true;

        while(scape) {
            System.out.println("Digite uma nota");
            double not = sc.nextDouble();
            notas.add(not);
            
            System.out.println("Quer digitar outra nota? [sim/nao]");
            String resp = sc.next();
            switch(resp) {
                case "nao":
                    scape = false;
                    break;
                case "sim":
                    scape = true;
                default:
            }
        }

        double sum = 0.0;

        for (int i = 0; i < notas.size(); i++) {
            sum = sum + notas.get(i);
        }

        double med = sum/notas.size();
        System.out.println(med);
    }
}
