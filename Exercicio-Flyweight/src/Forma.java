public class Forma {
    private Cor cor;
    private String posicao;
    private int dimensao;

    public Forma(Cor cor, String posicao, int dimensao) {
        this.cor = cor;
        this.posicao = posicao;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Forma: Cor=" + cor.getNome() + ", Posição=" + posicao + ", Dimensão=" + dimensao + "]";
    }
}