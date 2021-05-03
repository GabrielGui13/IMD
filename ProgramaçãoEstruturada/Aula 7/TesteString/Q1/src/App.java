public class App {
    public static void main(String[] args) throws Exception {
        String nome = "gabriel";

        System.out.println(nome.startsWith("G")); //false
        System.out.println(nome.startsWith("g")); //true
        System.out.println(nome.endsWith("l")); //true

        System.out.println(nome.indent(1)); //identação

        System.out.println(nome.indexOf("bri")); //2, primeiro encontrado

        String x = "oi";
        String y = "oi";

        if (x == y) System.out.println(true);

        if (x.equals(y)) System.out.println(true);
        else System.out.println(false);
    }
}
