import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        String letra = leitor.nextLine();

        switch (letra.toLowerCase()) {
            case "a": case "sim":
                System.out.println("Argentina");
                break;
            case "b":
                System.out.println("Brasil");
                break;
            case "c":
                System.out.println("Canada");
                break;
            case "d":
                System.out.println("Dinamarca");
                break;
            case "e":
                System.out.println("Espanha");
                break;
            case "f":
                System.out.println("Franca");
                break;
            case "g":
                System.out.println("Grecia");
                break;
            case "h":
                System.out.println("Hungria");
                break;
            case "i":
                System.out.println("Italia");
                break;
            case "j":
                System.out.println("Japao");
                break;
            case "m":
                System.out.println("Mexico");
                break;
            case "n":
                System.out.println("Noruega");
                break;
            case "p":
                System.out.println("Portugal");
                break;
            case "r":
                System.out.println("Republica Democratica do Congo");
                break;
            case "s":
                System.out.println("Siria");
                break;
            case "t":
                System.out.println("Turquia");
                break;
            case "u":
                System.out.println("Uruguai");
                break;
            case "v":
                System.out.println("Vaticano");
                break;
            default: //k, l, o, q, w, x, y, z
                System.out.println("Nao existe pais");
                break;
        }
    }
}
