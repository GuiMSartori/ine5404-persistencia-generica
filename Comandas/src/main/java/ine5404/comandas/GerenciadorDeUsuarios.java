package ine5404.comandas;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author martin
 */
public class GerenciadorDeUsuarios implements Serializable {

    protected Map<String, String> mapaLoginSenha;

    public GerenciadorDeUsuarios() {
        this.mapaLoginSenha = new HashMap();
    }

    public void addLoginSenha(String login, String senha) {
        mapaLoginSenha.put(login, senha);
    }

    public boolean autenticar(String login, String senha) {
        String senhaTeste = mapaLoginSenha.get(login);
        if (senhaTeste != null) {
            return senhaTeste.equals(senha);
        }
        return false;
    }
}
