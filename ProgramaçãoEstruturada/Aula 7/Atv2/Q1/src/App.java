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

        String n1 = nome1.toUpperCase();
        String n2 = nome2.toUpperCase();

        if (n1.equals(n2)) {
            System.out.println(true);
            System.out.println(n1);
            System.out.println(n2);
        }
        else {
            System.out.println(false);
            System.out.println(n1);
            System.out.println(n2);
        }

        n1 = nome1.toLowerCase();
        n2 = nome2.toLowerCase();

        if (n1.equals(n2)) {
            System.out.println(true);
            System.out.println(n1);
            System.out.println(n2);
        }
        else {
            System.out.println(false);
            System.out.println(n1);
            System.out.println(n2);
        }
    }
}
