import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int numero, aux = 0;
        do {
            numero = leitor.nextInt();
            aux++;

        } while (Math.pow(numero, 2) != 0);

        System.out.print("Acaboou! Média de tentativas: " + aux);
    }
}
