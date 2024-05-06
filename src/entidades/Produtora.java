package entidades;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a produtora de energia
 * Ela possui uma capacidade X de megawatts que deseja vender, e seu valor total
 */
@Data
@Builder
public class Produtora {

    private int capacidade;
    private int valor;

    @Builder.Default
    private List<Lance> lances = new ArrayList<>();

    /**
     * Adiciona um novo lance à lista de lances selecionados
     *
     * @param lance lance de referência
     */
    public void adicionarLance(Lance lance) {
        this.getLances().add(lance);
        this.setValor(this.getValor() + lance.getValor());
    }

    /**
     * Remove um lance da lista de lances selecionados
     *
     * @param lance lance de referência
     */
    public void removerLance(Lance lance) {
        this.getLances().remove(lance);
        this.setValor(this.getValor() - lance.getValor());
    }
}
