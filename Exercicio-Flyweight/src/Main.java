
public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.adicionarForma("Verde", "1,1", 20);
        formaManager.adicionarForma("Azul", "2,2", 30);
        formaManager.adicionarForma("Verde", "4,4", 50);

        formaManager.exibirFormas();
    }
}
