package ine5404.comandas;

import java.util.List;

/**
 *
 * @author martin
 */
public class Comanda {

    protected Cliente cliente;
    List<Pedido> pedidos;

    public Comanda(Cliente cliente) {
        this.cliente = cliente;
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
