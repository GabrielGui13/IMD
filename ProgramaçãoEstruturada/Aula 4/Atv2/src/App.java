import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //Q1
        /* int n = leitor.nextInt();
        if (n % 2 == 0) System.out.println("Par");
        else System.out.println("Impar"); */

        //Q2
        String[] p1 = leitor.nextLine().split(" ");
        String[] p2 = leitor.nextLine().split(" ");

        String nomep1 = p1[0];
        String nomep2 = p2[0];
        int idadep1 = Integer.parseInt(p1[1]);
        int idadep2 = Integer.parseInt(p1[1]);
        
        if (idadep1 > idadep2) System.out.println(nomep1 + " eh mais velho");
        else System.out.println(nomep2 + " eh mais velho");
    }
}
