import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        //Q1
        /* int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitor.nextInt();
        }
        for (int y = 0; y < numeros.length; y++) {
            if (numeros[y] % 2 == 1) {
                System.out.print(numeros[y] + " ");
            }
        } */

        //Q2
        /* int range = 0, aux = 1;
        while (aux != 0) {
            range = leitor.nextInt();
            if (range < 1 || range > 4) System.out.println("Numero invalido");
            else break;
        }
        System.out.println("Numero digitado: " + range); */

        //Q3
        /* for (int a = 0; a < 15; a += 2) {
            System.out.println(a);
        } */
    }
}
