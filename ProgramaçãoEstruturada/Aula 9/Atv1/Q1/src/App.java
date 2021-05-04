public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Fibonacci(7));
    }
    public static int Fibonacci(int n) {
        if (n <= 1) return 1;
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
