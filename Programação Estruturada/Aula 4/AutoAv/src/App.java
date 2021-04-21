import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        //Q1
        /* String op = leitor.nextLine();
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int total = 0;

        if (op.toUpperCase().equals("A")) total = n1 + n2;
        else if (op.toUpperCase().equals("B")) total = n1 - n2;
        else if (op.toUpperCase().equals("C")) total = n1 * n2;
        else if (op.toUpperCase().equals("D")) total = n1 / n2;
        else System.out.println("Nao eh uma operacao valida");

        System.out.println(total); */

        //Q2
        int numero = leitor.nextInt();
        if (numero > 0) System.out.println(numero * 2);
        else System.out.println(Math.pow(numero, 2));
    }
}
