package io.github.fernando.clientes.exception;

public class UsuarioCadastradoException  extends  RuntimeException{

    public UsuarioCadastradoException(String login){
        super("Usuário ja cadastrado para o login" + login);

    }
}
