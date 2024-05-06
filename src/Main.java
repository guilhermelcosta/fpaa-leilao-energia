import entidades.Lance;
import entidades.Produtora;

public class Main {
    public static void main(String[] args) {
        Produtora produtora = Produtora.builder().build();
        produtora.adicionarLance(Lance.builder().megawatts(1).valor(2).build());
        System.out.printf("");
    }
}
