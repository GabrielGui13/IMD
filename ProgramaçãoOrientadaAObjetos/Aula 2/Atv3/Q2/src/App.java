public class App {
    public static void main(String[] args) throws Exception {
        Livro HP = new Livro();
        HP.setNome("Harry Potter");
        HP.setGenero("Aventura");
        HP.setPaginas(300);
        HP.Desgastar();
        HP.Desgastar();
        HP.Desgastar();
        System.out.printf("Nome = %s \nGenero = %s \nPaginas = %d \nDesgaste = %d", HP.getNome(), HP.getGenero(), HP.getPaginas(), HP.getDesgaste());
    }
}
class Livro {
    private String nome, genero;
    private int paginas, desgaste = 100;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return this.paginas;
    }
    public int getDesgaste() {
        return this.desgaste;
    }
    public void Desgastar() {
        this.desgaste -= 5;
    }
}
