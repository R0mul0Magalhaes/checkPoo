public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0f,);
        Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e Caudas");
        Mamifero ursoDoCanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");

        System.out.println("Dados do camelo:");
        camelo.dadosDoMamifero();

        System.out.println("\nDados do tubarão:");
        tubarao.dadosDoPeixe();

        System.out.println("\nDados do Elefante-Africano:");
        ursoDoCanada.dadosDoMamifero();
    }
}