public class App {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo(10, 20);
        Quadrado q1 = new Quadrado(30);
        Circulo c1 = new Circulo(5);
        System.out.println(r1);
        System.out.println(q1);
        System.out.println(c1);
    }
}
abstract class Forma {
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    public String toString() {
        return "Area = " + calcularArea() + "\nPerimetro = " + calcularPerimetro(); 
    }
}
class Retangulo extends Forma {
    private float l1, l2;
    public Retangulo(float l1, float l2) {
        this.l1 = l1;
        this.l2 = l2;
    } 
    @Override
    public float calcularArea() {
        return l1 * l2;
    }
    @Override
    public float calcularPerimetro() {
        return 2 * l1 + 2 * l2;
    }
}
class Quadrado extends Retangulo {
    public Quadrado(float l) {
        super(l, l);
    }
}
class Circulo extends Forma {
    private float raio;
    public Circulo(float raio) {
        this.raio = raio;
    }
    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }
    @Override
    public float calcularPerimetro() {
        return (float) Math.PI * raio * 2;
    }
}