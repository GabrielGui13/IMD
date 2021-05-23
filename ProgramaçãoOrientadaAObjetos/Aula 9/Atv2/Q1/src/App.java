public class App {
    public static void main(String[] args) throws Exception {
        Brinquedo carro = new Brinquedo("Carrinho de Controle Remoto");
        carro.Velocidade(100);
        carro.Mover();
        carro.Mover();
        carro.Mover();
        System.out.println(carro);
    }
}
class Brinquedo {
    private String nome;
    private double velocidade, aceleracao = 1;

    public Brinquedo() {
        this.nome = "Brinquedo";
    }
    public Brinquedo(String nome) {
        this.nome = nome;
    }
    public void Mover() {
        System.out.println("Dirigindo...");
        this.velocidade += this.aceleracao;
    } 
    public void Velocidade(int vel) {
        this.velocidade = vel;
    }
    public void Velocidade(double vel) {
        this.velocidade = vel;
    }
    public void Velocidade(float vel, double ac) {
        this.velocidade = vel;
        this.aceleracao = ac;
    }
    @Override
    public String toString() {
        return "Nome = " + this.nome + "\nVelocidade = " + this.velocidade + "\nAceleracao = " + this.aceleracao;
    }
}
