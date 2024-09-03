public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMediaDoAnimal, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMediaDoAnimal);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosDoMamifero() {
        dados();
        System.out.println("Alimento: " + alimento);
    }
}