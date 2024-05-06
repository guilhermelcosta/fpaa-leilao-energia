package entidades;

import lombok.Builder;
import lombok.Data;

/**
 * Lance a ser fornecido por uma produtora
 * Cada lance é feito com relação a uma quantidade X de megawatts e o valor que quer dar por essa quantidade
 */
@Data
@Builder
public class Lance {
    private int megawatts;
    private int valor;
}
