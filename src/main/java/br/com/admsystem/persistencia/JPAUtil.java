package br.com.admsystem.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final String PERSISTENCE_UNIT = "adm_system-PU";

    private static EntityManager em;
    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        
        //caso o EntityManagerFactory esteja nulo ou não esteja aberto, cria-se o EntityManagerFactory
        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        //caso o EntityManager esteja nulo ou não esteja aberto, cria-se o EntityManager
        if (em == null || !em.isOpen()) {
            em = emf.createEntityManager();
        }

        return em;
    }

    public static void closeEntityManager() {
        //caso o EntityManagerFactory esteja aberto fecha-se o em e o emf
        if (em.isOpen() && em != null) {
            em.close();
            emf.close();
        }
    }
}
