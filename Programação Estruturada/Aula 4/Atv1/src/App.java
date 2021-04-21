import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //Q1
        /* String[] n = leitor.nextLine().split(" ");
        int soma = 0;

        for (int i = 0; i < n.length; i++) {
            soma += Integer.parseInt(n[i]);
        }
        if (soma % 2 == 0) System.out.println("Numero eh multiplo de 2");
        else System.out.println("Nao eh multiplo de 2"); */

        //Q2
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        if (a < b + c && b < a + c && c < a + b) System.out.println("Formam um triangulo");
        else System.out.println("Nao formam um triangulo");
    }
}
