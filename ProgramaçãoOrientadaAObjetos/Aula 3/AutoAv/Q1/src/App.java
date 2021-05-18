public class App {
    public static void main(String[] args) throws Exception {
        Carro Mustang = new Carro ("Ford", "Mustang", "Azul", "GAB-1308", "Gasolina", 2013, 350);
        System.out.print(Mustang.getMarca() + " ");
        System.out.println(Mustang.getNome());
    }
}
class Carro {
    private String marca, nome, cor, placa, comb;
    private int ano, velocidade;
    public Carro (String marca, String nome, String cor, String placa, String comb, int ano, int velocidade) {
        this.marca = marca;
        this.nome = nome;
        this.cor = cor;
        this.placa = placa;
        this.comb = comb;
        this.ano = ano;
        this.velocidade = velocidade;
    } 
    public String getMarca() {
        return marca;
    }
    public String getNome() {
        return nome;
    }
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public String getComb() {
        return comb;
    }
    public int getAno() {
        return ano;
    }
    public int getVelocidade() {
        return velocidade;
    }

}
