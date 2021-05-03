import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String nome1 = leitor.nextLine();
        String nome2 = leitor.nextLine();

        if (nome1.equals(nome2)) {
            System.out.println(true);
            System.out.println(nome1);
            System.out.println(nome2);
        }
        else {
            System.out.println(false);
            System.out.println(nome1);
            System.out.println(nome2);
        } 

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println(true);
            System.out.println(nome1);
            System.out.println(nome2);
        }
        else {
            System.out.println(false);
            System.out.println(nome1);
            System.out.println(nome2);
        }
    }
}
