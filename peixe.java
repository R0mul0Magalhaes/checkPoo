public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMediaDoAnimal, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMediaDoAnimal);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosDoPeixe() {
        dados();
        System.out.println("Característica: " + caracteristica);
    }
}