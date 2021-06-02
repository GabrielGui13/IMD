class App {
    public static void main(String[] args) {
      Esporte academia = new Esporte("preto", "poliester", 40, 37.99);
      System.out.println(academia);
}
}
class Roupa {
    protected String cor, tecido, status, categoria;
    protected int tamanho;
    protected double preco;
    public Roupa(String cor, String tecido, int tamanho, double preco) {
      this.cor = cor;
      this.tecido = tecido;
      this.status = "Em uso";
      this.categoria = "Indefinido";
      this.tamanho = tamanho;
      this.preco = preco;
    }
    @Override
    public String toString() {
      return String.format("Categoria = %s\nTecido = %s\nCor = %s\nTamanho = %d\nPreco = %.2f\nStatus = %s", categoria, tecido, cor, tamanho, preco, status);
    }
}
class Social extends Roupa {
    public Social(String cor, String tecido, int tamanho, double preco) {
      super(cor, tecido, tamanho, preco);
      this.categoria = "Social";
    }
}
class Esporte extends Roupa {
    public Esporte(String cor, String tecido, int tamanho, double preco) {
      super(cor, tecido, tamanho, preco);
      this.categoria = "Esporte";
    }
}
class EsporteFino extends Roupa {
    public EsporteFino(String cor, String tecido, int tamanho, double preco) {
      super(cor, tecido, tamanho, preco);
      this.categoria = "Esporte Fino";
    }
}
class Trabalho extends Roupa {
    public Trabalho(String cor, String tecido, int tamanho, double preco) {
      super(cor, tecido, tamanho, preco);
      this.categoria = "Trabalho";
    }
}