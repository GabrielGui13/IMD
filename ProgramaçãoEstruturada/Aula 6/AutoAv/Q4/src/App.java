public class App {
    public static void main(String[] args) throws Exception {
        int A[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}; //Matriz 3x4
        int B[][] = {{13, 14}, {15, 16}, {17, 18}}; //Matriz 3x2
        int C[][] = new int[3][6]; //Matriz 3x6

        System.out.println("A");
        int aux1 = 0, aux2 = 0;
        for (int i = aux1; i < A.length; i++) { //preencher C com A
            for (int j = aux2; j < A[i].length; j++) {
                C[i][j] = A[i][j];
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("B");
        for (int i = 0; i < B.length; i++) { //preencehr C com B
            for (int j = 4; j < C[i].length; j++) {
                C[i][j] = B[i][j - 4];
                System.out.print(B[i][j - 4] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("C");
        for (int i = 0; i < C.length; i++) { //mostrar C
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
