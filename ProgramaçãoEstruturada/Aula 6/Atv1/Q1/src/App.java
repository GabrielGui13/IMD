import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int qtd = leitor.nextInt();
        int notas[] = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            notas[i] = leitor.nextInt();
        }
        int x = 0;
        for (int y : notas) {
            System.out.print(x + ": ");
            System.out.println(y);
            x++;
        }
    }
}
