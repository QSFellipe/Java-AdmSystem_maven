package entities;

public class SessaoUsuario {
    private static int idUsuarioLogado;
    private static String nomeUsuario;
    private static String cargo;

    public static String getCargo() {
        return cargo;
    }

    public static void setCargo(String cargo) {
        SessaoUsuario.cargo = cargo;
    }
    
    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public static void setNomeUsuario(String nomeUsuario) {
        SessaoUsuario.nomeUsuario = nomeUsuario;
    }
    
    public static void setIdUsuarioLogado(int id) {
        idUsuarioLogado = id;
    }

    public static int getIdUsuarioLogado() {
        return idUsuarioLogado;
    }

    public static void logout() {
        idUsuarioLogado = -1; 
    }
}

