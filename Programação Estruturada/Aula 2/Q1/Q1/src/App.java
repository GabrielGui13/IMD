public class App {
    public static int a = 20;
    public static void main(String[] args) throws Exception {
        int b = 30, c = 40, d = 50, e = 60;
        char c1 = 'g', c2 = 'a', c3 = 't', c4 = 'o';

        System.out.println(String.format("%d, %d, %d, %d, %d, %c%c%c%c", a, b, c, d, e, c1, c2, c3, c4));

        System.out.println("    um\n        dois\n              tres");

        int aux = 1;
        System.out.println("Esta é a linha " + aux++);
        System.out.println("Esta é a linha " + aux++);
    }
}
