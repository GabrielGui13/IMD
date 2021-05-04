public class App {
    private static char[][] tabela;
    private static int t = 10;
    private static double prob = 0.7;
    private static int inicioDef;
    public static void main(String[] args) throws Exception {
        tabela = new char[t][t];
        criarTabela();
        boolean achou = procurarCaminho(inicioDef, 0); 
        if (achou) { 
            System.out.println("ACHOU O CAMINHO!"); 
        } else { 
            System.out.println("Não tem caminho!"); 
        }
        imprimirTabela();
    }
    public static void criarTabela() {
        int inicio = gerarNum(0, t - 1);
        inicioDef = inicio;
        int destino = gerarNum(0, t - 1);
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
        tabela[0][inicio] = 'I';
        tabela[9][destino] = 'D';
    }
    public static void imprimirTabela() {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(tabela[i][j]);
            }
            System.out.println();
        }
    }
    public static int gerarNum(int min, int max) {
        return (int) (Math.round(Math.random() * (max - min))) + min;
    }
    public static boolean procurarCaminho(int linhaAtual, int colunaAtual) { 
        int proxLinha; 
        int proxColuna; 
        boolean achou = false; 
        // tenta subir 
        proxLinha = linhaAtual - 1; 
        proxColuna = colunaAtual; 
        achou = tentarCaminho(proxLinha, proxColuna); 
        // tenta descer 
        if (!achou) { 
            proxLinha = linhaAtual + 1; 
            proxColuna = colunaAtual; 
            achou = tentarCaminho(proxLinha, proxColuna); 
        } 
        // tenta à esquerda 
        if (!achou) { 
            proxLinha = linhaAtual; 
            proxColuna = colunaAtual - 1; 
            achou = tentarCaminho(proxLinha, proxColuna); 
        } 
        // tenta à direita 
        if (!achou) { 
            proxLinha = linhaAtual; 
            proxColuna = colunaAtual + 1; 
            achou = tentarCaminho(proxLinha, proxColuna); 
        } 
        return achou; 
    }
    private static boolean tentarCaminho(int proxLinha, int proxColuna) { 
        boolean achou = false; 
        if (tabela[proxLinha][proxColuna] == 'D') { 
            achou = true; 
        } else if (posicaoVazia(proxLinha, proxColuna)) { 
            tabela[proxLinha][proxColuna] = '*'; 
            imprimirTabela(); 
            achou = procurarCaminho(proxLinha, proxColuna); 
            if (!achou) { 
                tabela[proxLinha][proxColuna] = '#';  
            } 
        } 
        return achou; 
    }
    public static boolean posicaoVazia(int linha, int coluna) { 
        boolean vazio = false; 
        if (linha >= 0 && coluna >= 0 && linha < t && coluna < t) { 
            vazio = (tabela[linha][coluna] == ' '); 
        } 
        return vazio; 
    }
}