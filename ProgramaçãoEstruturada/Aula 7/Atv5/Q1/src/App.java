import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        char ponto = '.';
        int inicio = 0;
        int posicao = nome.indexOf(ponto);
        
        System.out.println("Existe ponto nas posicoes:");
        
        while(inicio < nome.length() && posicao != - 1) {
            System.out.println(posicao);
            inicio = posicao + 1;
            posicao = nome.indexOf(ponto, inicio);
        }
    }
}
