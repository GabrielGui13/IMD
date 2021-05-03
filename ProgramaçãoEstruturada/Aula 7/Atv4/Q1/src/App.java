import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

		System.out.println("Digite uma palavra:");
		String nome1 = leitor.nextLine();

		System.out.println("Inverso:");
		for (int i = nome1.length() - 1; i >= 0 ; i--) {
			System.out.print(nome1.charAt(i));
		}
        System.out.println();
		for (int i = nome1.length() - 1; i >= 0 ; i--) {
            if(i % 2 == 1) System.out.print(nome1.charAt(i));
		}
    }
}
