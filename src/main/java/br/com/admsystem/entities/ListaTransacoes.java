package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaTransacoes {

    private static final List<CadastroTransacoes> listaTransacoes = new ArrayList<>();

    public static List<CadastroTransacoes> listar() {
        return listaTransacoes;
    }

    public static void adicionar(CadastroTransacoes cadastro) {
        listaTransacoes.add(cadastro);
    }
}

