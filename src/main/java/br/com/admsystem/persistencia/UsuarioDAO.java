package br.com.admsystem.persistencia;

import entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

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

    public Usuario pesquisarId(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Usuario> consulta = em.createQuery("Select u from Usuarios u Where u.id = :u.id", Usuario.class);
            consulta.setParameter("id", id);
            return consulta.getSingleResult();

        } catch (NoResultException e) {
            System.out.println("Erro ao buscar usuario");
            return null;
        } catch (Exception e) {
            System.out.println("Erro ao buscar usuario");
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Usuario> pesquisar() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Usuario> usuario = new ArrayList<>();

        try {
            Query consulta = em.createQuery("Select u from Usuarios u");
            usuario = consulta.getResultList();

        } catch (Exception e) {
            throw new RuntimeException("erro");
        } finally {
            JPAUtil.closeEntityManager();
        }
        return usuario;
    }

    public void atualizar(Usuario u) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Não foi possível atualizar" + e.getMessage());
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Usuario buscarEmail(String email) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro");
            return null;
        }
    }

}
