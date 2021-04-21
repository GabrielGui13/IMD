import java.util.Scanner; //Importa o scanner ao Java

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in, "UTF-8");
        
        //Q1
        /* System.out.println("Digite seu nome!");
        String nome = leitor.nextLine();
        System.out.println(String.format("Entao seu nome eh %s\nOla %s", nome, nome));
         */

        //Q2
        /* String f1 = leitor.nextLine();
        String f2 = leitor.nextLine();
        String f3 = leitor.nextLine();
        System.out.println(f3 + "\n" + f2 + "\n" + f1); */

        //Q3
        String[] info = leitor.nextLine().split(" ");
        String nome = info[0];
        String disciplina = info[1];
        int n1 = Integer.parseInt(info[2]);
        int n2 = Integer.parseInt(info[3]);
        int n3 = Integer.parseInt(info[4]);
        int n4 = Integer.parseInt(info[5]);

        int media = (n1 + n2 + n3 + n4) / 4;
        System.out.println(String.format("O aluno %s, ficou com %d de media na disciplina de %s", nome, media, disciplina));

    }
}
