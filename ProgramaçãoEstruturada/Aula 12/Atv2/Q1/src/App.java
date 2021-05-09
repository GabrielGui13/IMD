import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o filme");
        Filme f1 = registrarFilme();

        System.out.println(f1);
    }
    public static Filme registrarFilme() {
        Scanner leitor = new Scanner(System.in);
        Filme f = new Filme();

        f.nome = leitor.nextLine();
        f.autor = leitor.nextLine();
        f.ano = leitor.nextInt();
        f.preco = leitor.nextDouble();

        return f;
    }
}
class Filme {
    public String nome;
    public String autor;
    public int ano;
    public double preco;

    @Override
    public String toString() {
        return String.format("Nome = %s \nAutor = %s \nAno = %d \nPreco = R$%.2f", nome, autor, ano, preco);
    }
}
