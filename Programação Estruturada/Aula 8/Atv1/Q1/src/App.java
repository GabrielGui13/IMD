public class App {
    public static void main(String[] args) throws Exception {
        double n1 = 100;
        double n2 = 3;
        double n3 = 2;
        double n4 = 5.3;

        double media = calcMedia(n1, n2, n3, n4);
        System.out.printf("Sua media eh de %.2f \nSituacao: %s", media, situacao(media));
    }
    public static double calcMedia(double n1, double n2, double n3, double n4) {
        double media = (n1 + n2 + n3 + n4) / 4;
        return media;
    }
    public static String situacao(double media) {
        if (media >= 7 && media <= 10) return "Aprovado";
        else if (media < 7 && media >= 3) return "Recuperacao";
        else if (media < 3 && media > 0) return "Reprovado";
        else return "Valor invalido";
    } 
}
