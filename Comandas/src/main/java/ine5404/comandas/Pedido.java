package ine5404.comandas;

/**
 *
 * @author martin
 */
public class Pedido {

    protected String descricao;
    protected double valor;

    public Pedido(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

}
