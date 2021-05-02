import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int numeros[][] = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12}};
        int maior = numeros[0][0];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > maior) maior = numeros[i][j];
            }
        }
        System.out.println(maior);
    }
}
