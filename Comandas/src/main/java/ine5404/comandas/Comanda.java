package ine5404.comandas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin
 */
public class Comanda implements Serializable {

    protected Cliente cliente;
    protected List<Pedido> pedidos;

    public Comanda(Cliente cliente) {
        this.cliente = cliente;
        this.pedidos = new ArrayList();
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double getTotal() {
        double total = 0;
        for (Pedido p : pedidos) {
            total += p.getValor();
        }
        return total;
    }
}
