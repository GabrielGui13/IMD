public class App {
    public static void main(String[] args) throws Exception {
        String[][] tabuleiro = new String[8][8];
        
        int aux = 0;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (aux % 2 == 0) {
                    if (j % 2 == 0) tabuleiro[i][j] = "   ";
                    else tabuleiro[i][j] = " % ";
                }
                else {
                    if (j % 2 != 0) tabuleiro[i][j] = "   ";
                    else tabuleiro[i][j] = " % ";
                }
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
            aux++;
        }
    }
}

