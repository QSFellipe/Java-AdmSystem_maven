package br.com.admsystem.persistencia;

import entities.Relatorio;
import jakarta.persistence.EntityManager;

public class RelatarioDAO {

    public Relatorio cadastrar(Relatorio r) {
        //Instancia o EntityManager
        EntityManager em = JPAUtil.getEntityManager();

        try {
            //Insere os dados do usuario no banco
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            //Fecha o EntityManager
            JPAUtil.closeEntityManager();
        }
        return r;
    }
}

