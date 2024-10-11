import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> listaFormas;
    private CorFactory corFactory;

    public FormaManager() {
        listaFormas = new ArrayList<>();
        corFactory = new CorFactory();
    }

    public void adicionarForma(String nomeCor, String posicao, int dimensao) {
        Cor cor = corFactory.obterCor(nomeCor);
        Forma forma = new Forma(cor, posicao, dimensao);
        listaFormas.add(forma);
    }

    public void exibirFormas() {
        for (Forma forma : listaFormas) {
            System.out.println(forma);
        }
    }
}