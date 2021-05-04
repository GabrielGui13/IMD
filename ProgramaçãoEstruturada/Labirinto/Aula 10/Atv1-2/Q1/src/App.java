public class App {
    private static char[][] tabela;
    private static int t = 10;
    private static double prob = 0.7;
    public static void main(String[] args) throws Exception {
        tabela = new char[t][t];
        criarTabela();
        imprimirTabela();
    }
    public static void criarTabela() {
        for (int i = 0; i < t; i++) {
                tabela[0][i] = '-';
                tabela[t - 1][i] = '-';
                tabela[i][0] = '|';
                tabela[i][t - 1] = '|';
        }
        for (int i = 1; i < t - 1; i++) {
            for (int j = 1; j < t - 1; j++) {
                if (Math.random() > prob) tabela[i][j] = '#';
                else tabela[i][j] = ' ';
            }
        }
    }
    public static void imprimirTabela() {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(tabela[i][j]);
            }
            System.out.println();
        }
    }
}
