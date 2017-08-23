package ine5404.comandas;

import java.io.Serializable;

/**
 *
 * @author martin
 */
public class Cliente implements Serializable {

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
