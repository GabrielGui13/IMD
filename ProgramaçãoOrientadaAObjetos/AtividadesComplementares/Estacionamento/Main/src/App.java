public class App {
    public static void main(String[] args) throws Exception {
        Turista Gabriel = new Turista("Gabriel", 18, 1338483);
        System.out.println(Gabriel);
    }
}
class Pessoa {
    protected String nome;
    protected int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Nome = " + this.nome + "\nIdade = " + this.idade;
    }
}
class Turista extends Pessoa {
    private int passaporte;
    public Turista(String nome, int idade, int passaporte) {
        super(nome, idade);
        this.passaporte = passaporte;
    }
    @Override
    public String toString() {
        return super.toString() + "\nPassaporte = " + this.passaporte;
    }
}
class Motorista extends Pessoa {
    private int cnh;
    public Motorista(String nome, int idade, int cnh) {
        super(nome, idade);
        this.cnh = cnh;
    }
    @Override
    public String toString() {
        return super.toString() + "\nCNH = " + this.cnh;
    }
}
class Piloto extends Pessoa {
    private int licenca;
    public Piloto(String nome, int idade, int licenca) {
        super(nome, idade);
        this.licenca = licenca;
    }
    @Override
    public String toString() {
        return super.toString() + "\nLicenca = " + this.licenca;
    }
}
