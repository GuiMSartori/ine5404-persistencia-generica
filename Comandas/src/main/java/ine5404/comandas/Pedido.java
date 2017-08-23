package ine5404.comandas;

import java.io.Serializable;

/**
 *
 * @author martin
 */
public class Pedido implements Serializable {

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
