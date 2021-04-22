import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        double nota = 0, materias = 0, aux = 1, receive = 0;

        while (aux != 0) {
            System.out.println("Digite a nota");
            receive = leitor.nextDouble();
            aux = receive;
            nota += receive;
            if (aux == 0) break;
            materias++;
        }
        double ira = nota / materias;

        System.out.println(String.format("Seu ira esta de %.2f", ira));
    }
}
