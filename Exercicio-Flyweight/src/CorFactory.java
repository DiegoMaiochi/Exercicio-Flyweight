import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private Map<String, Cor> mapaCores;

    public CorFactory() {
        mapaCores = new HashMap<>();
    }

    public Cor obterCor(String nome) {
        Cor cor = mapaCores.get(nome);
        if (cor == null) {
            cor = new Cor(nome);
            mapaCores.put(nome, cor);
        }
        return cor;
    }
}