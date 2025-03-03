package entities;

public class SessaoUsuario {
    private static int idUsuarioLogado;
    private static String nomeUsuario;
    private static String cargo;

    public static int getIdUsuarioLogado() {
        return idUsuarioLogado;
    }

    public static void setIdUsuarioLogado(int idUsuarioLogado) {
        SessaoUsuario.idUsuarioLogado = idUsuarioLogado;
    }

    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public static void setNomeUsuario(String nomeUsuario) {
        SessaoUsuario.nomeUsuario = nomeUsuario;
    }

    public static String getCargo() {
        return cargo;
    }

    public static void setCargo(String cargo) {
        SessaoUsuario.cargo = cargo; 
    }

    public static void logout() {
        idUsuarioLogado = -1; 
    }
}

