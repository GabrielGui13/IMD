import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class App {
  public static void main(String[] args) {
    GuardaRoupa guardaRoupa = new GuardaRoupa();
    Lavanderia lavanderia = new Lavanderia();
    Roupa academia = new Esporte("preto", "poliester", 40, 37.99);
    Roupa academia2 = new Esporte("branco", "poliester", 42, 30.99);
    Roupa academia3 = new Esporte("branco", "poliester", 42, 30.99);
    guardaRoupa.Guardar(academia2); 
    guardaRoupa.Guardar(academia3); 
    guardaRoupa.Guardar(academia);
    lavanderia.Guardar(academia2); 
    lavanderia.Guardar(academia3); 
    lavanderia.Guardar(academia);
    System.out.println(guardaRoupa + "\n");
    System.out.println(lavanderia);
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
class GuardaRoupa {
  private String cor;
  private List<Roupa> armario;
  public GuardaRoupa() {
    this.armario = new ArrayList<Roupa>();
  }
  public void Guardar(Roupa roupa) {
    roupa.status = "No guarda-roupas";
    armario.add(roupa);
  }
  public void Retirar(Roupa roupa) {
    roupa.status = "Em uso";
    armario.remove(roupa);
  }
  public int Quantidade() {
    return armario.size();
  }
  public String corPredominante() {
    int vermelho = 0, azul = 0, amarelo = 0, verde = 0, preto = 0, branco = 0, generico = 0;
    int maior = 0;
    String nomeMaior = "generico";

    for (Roupa roupa : armario) {
      switch (roupa.cor.toLowerCase()) {
        case "vermelho":
          vermelho++;
          if (vermelho >= maior) {
            maior = vermelho;
            nomeMaior = "vermelho";
          }
          break;
        case "azul":
          azul++;
          if (azul >= maior) {
            maior = azul;
            nomeMaior = "azul";
          }
          break;
        case "amarelo":
          amarelo++;
          if (amarelo >= maior) {
            maior = amarelo;
            nomeMaior = "amarelo";
          }
          break;
        case "verde":
          verde++;
          if (verde >= maior) {
            maior = verde;
            nomeMaior = "verde";
          }
          break;
        case "preto":
          preto++;
          if (preto >= maior) {
            maior = preto;
            nomeMaior = "preto";
          }
          break;
        case "branco":
          branco++;
          if (branco >= maior) {
            maior = branco;
            nomeMaior = "branco";
          }
          break;
        default:
          generico++;
      }
    }
    return nomeMaior;
  }
  @Override
  public String toString() {
    return "Guarda Roupa \nQuantidade de Roupas = " + Quantidade() + "\nCor = " + corPredominante();
  }
}
class Lavanderia {
  private String cor;
  private List<Roupa> maquina;
  public Lavanderia() {
    this.maquina = new ArrayList<Roupa>();
  }
  public void Guardar(Roupa roupa) {
    roupa.status = "Na lavanderia";
    maquina.add(roupa);
  }
  public void Retirar(Roupa roupa) {
    roupa.status = "Em uso";
    maquina.remove(roupa);
  }
  public int Quantidade() {
    return maquina.size();
  }
  @Override
  public String toString() {
    return "Lavanderia \nQuantidade de Roupas = " + Quantidade();
  }
}