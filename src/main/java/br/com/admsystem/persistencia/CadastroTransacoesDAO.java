package br.com.admsystem.persistencia;

import entities.CadastroTransacoes;
import jakarta.persistence.EntityManager;

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
    
    //update cadastro
    
    //buscar os cadastros
    
}
