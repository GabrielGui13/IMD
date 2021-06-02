import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Lindo();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Fim do teste!");
        }
    }
    public static void Lindo() throws GabrielDuvida, GabrielErro {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Gabriel eh lindo? (S/N)");
        String resposta = leitor.nextLine().toUpperCase();
        if (resposta.equals("S") || resposta.equals("SIM") || resposta.equals("SS")) System.out.println("Parabens! Voce acertou!");
        else if (resposta.equals("N") || resposta.equals("NAO") || resposta.equals("NN")) throw new GabrielErro();
        else throw new GabrielDuvida();
    }
}
class GabrielErro extends Exception {
    @Override
    public String toString() {
        return "Infelizmente o erro Gabriel 52468 foi acionado, sinalizando uma mentira. ERROR 404 de Beleza";
    }
}
class GabrielDuvida extends Exception {
    @Override
    public String toString() {
        return "Infelizmente o erro Gabriel 52468 V2 foi acionado, sinalizando uma duvida. ERROR 404 de confusao. O que aconteceu?";
    }
}
