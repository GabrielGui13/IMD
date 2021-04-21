import java.util.Scanner; //Importa o scanner ao Java

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite seu nome!");
        Scanner leitor = new Scanner(System.in); //Instancia e inicializa um leitor de dados do teclado
        String nome = leitor.nextLine();
        System.out.println(String.format("Entao seu nome eh %s\nOla %s", nome, nome));
    }
}
