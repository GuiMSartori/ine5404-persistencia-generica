package ine5404.comandas;

import java.util.HashMap;

/**
 *
 * @author martin
 */
public class GerenciadorDeUsuarios {

    HashMap<String, String> mapaLoginSenha;

    public GerenciadorDeUsuarios(HashMap<String, String> mapaLoginSenha) {
        this.mapaLoginSenha = new HashMap() {
        };
    }

    public void addLoginSenha(String login, String senha) {
        mapaLoginSenha.put(login, senha);
    }

    public boolean autenticar(String login, String senha) {
        String senhaTeste = mapaLoginSenha.get(login);
        if (senhaTeste.equals(senha)) {
            return true;
        }
        return false;
    }
}
