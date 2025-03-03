        package entities;

public class SessaoUsuario {
    private static Usuario idUsuarioLogado;
    private static String nomeUsuario;
    private static String cargo;

    public static Usuario getIdUsuarioLogado() {
        return idUsuarioLogado;
    }

    public static void setIdUsuarioLogado(Usuario idUsuarioLogado) {
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
        idUsuarioLogado = null; 
    }
}

