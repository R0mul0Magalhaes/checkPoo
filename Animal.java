public class Animal {
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMediaDoAnimal;

    public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMediaDoAnimal) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMediaDoAnimal = velocidadeMediaDoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getnumeroDePatas() {
        return numeroDePatas;
    }

    public void setnumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getambiente() {
        return ambiente;
    }

    public void setambiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getvelocidadeMediaDoAnimal() {
        return velocidadeMediaDoAnimal;
    }
}