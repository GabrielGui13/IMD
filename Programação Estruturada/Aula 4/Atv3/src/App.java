import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        //Q1
        /* int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();

        if (n1 > n2) System.out.println(n1);
        else if (n1 < n2) System.out.println(n2);
        else System.out.println("Iguais"); */

        //Q2
        int nota = leitor.nextInt();
        if (nota > 0 && nota <= 3) System.out.println("Precisa melhorar muito!");
        else if (nota > 3 && nota < 7) System.out.println("Voce esta quase conseguindo!");
        else if (nota >= 7 && nota < 9) System.out.println("Voce conseguiu!");
        else System.out.println("Excelente!");
    }
}
