package br.com.admsystem.persistencia;

import entities.CadastroTransacoes;
import entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CadastroTransacoesDAO {

    public CadastroTransacoes cadastrar(CadastroTransacoes ct) {
        //Instancia o EntityManager
        EntityManager em = JPAUtil.getEntityManager();

        try {
            //Insere os dados do usuario no banco
            em.getTransaction().begin();
            em.persist(ct);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            //Fecha o EntityManager
            JPAUtil.closeEntityManager();
        }
        return ct;
    }

    public void excluir(int id) {

        //Instancia o EntityManager
        EntityManager em = JPAUtil.getEntityManager();
        try {
            //Remove o objeto do banco
            CadastroTransacoes cadastro = em.find(CadastroTransacoes.class, id);
            if (cadastro != null) {
                em.getTransaction().begin();
                em.remove(cadastro);
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

    public CadastroTransacoes obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(CadastroTransacoes.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void atualizar(CadastroTransacoes d) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<CadastroTransacoes> pesquisar() {
        EntityManager em = JPAUtil.getEntityManager();
        List<CadastroTransacoes> cadastro = new ArrayList<>();

        try {
            Query consulta = em.createQuery("Select c From CadastroTransacoes c", CadastroTransacoes.class);
            cadastro = consulta.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("erro");
        } finally {
            JPAUtil.closeEntityManager();
        }
        return cadastro;
    }
}
