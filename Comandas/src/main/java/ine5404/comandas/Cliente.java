package ine5404.comandas;

/**
 *
 * @author martin
 */
public class Cliente {

    protected String nome;
    protected int cpf;

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

}
