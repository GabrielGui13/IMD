import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva seu nome:");
        String nome = leitor.nextLine();

        if (nome.length() >= 7 && nome.substring(0, 7).equalsIgnoreCase("Gabriel")) {
            System.out.println("Ola Gabriel!");
        }
        else System.out.println("Ue, vc n eh Gabriel");
    }
}
