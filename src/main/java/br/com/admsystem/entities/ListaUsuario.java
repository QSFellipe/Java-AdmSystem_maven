package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuario {

    private static final List<Usuario> listaUsuario = new ArrayList<>();

    public static List<Usuario> listar() {
        return listaUsuario;
    }

    public static void adicionar(Usuario usuario) {
        listaUsuario.add(usuario);
    }
}
