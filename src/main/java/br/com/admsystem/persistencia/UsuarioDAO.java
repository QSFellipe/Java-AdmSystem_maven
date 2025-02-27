package br.com.admsystem.persistencia;

import entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import javax.naming.AuthenticationException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public Usuario cadastrar(Usuario u) {

        //Instancia o EntityManager
        EntityManager em = JPAUtil.getEntityManager();

        try {
            //Insere os dados do usuario no banco
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            //Fecha o EntityManager
            JPAUtil.closeEntityManager();
        }
        return u;
    }

    public Usuario autenticar(String email, String senha) {
        EntityManager em = JPAUtil.getEntityManager();

        Usuario usuario = null;

        try {
            //Verificacao se email e senha são nulos
            if (email == null || senha == null) {
                throw new IllegalArgumentException("Email e senha não podem ser nulos.");
            }

            //Consulta JPQL
            String jpql = "SELECT u FROM Usuario u WHERE u.email = :email AND u.senha = :senha";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("email", email);
            query.setParameter("senha", senha);

            usuario = query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Usuário ou senhas incorretos, Tente Novamente");
        } finally {
            JPAUtil.closeEntityManager();
        }

        return usuario;
    }

    public void excluir(int id) {
        
        //Instancia o EntityManager
        EntityManager em = JPAUtil.getEntityManager();
        try {
            //Remove o objeto do banco
            Usuario u = em.find(Usuario.class, id);
            if (u != null) {
                em.getTransaction().begin();
                em.remove(u);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            //Fecha o EntityManager
            JPAUtil.closeEntityManager();
        }
    }
}
