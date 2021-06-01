public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(acessarArray()[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Sim");
        }
    }
    public static int[] acessarArray() {
        int[] array = {1, 2, 3};
        return array;
    }
}
