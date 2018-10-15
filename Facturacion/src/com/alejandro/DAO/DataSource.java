
package com.alejandro.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class DataSource {

    private static EntityManager em = null;

    public static EntityManager getEntityManager() {
        if (em == null || !em.isOpen()) {
            ConfigXml config = new ConfigXml();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("FacturaPU", config.getConfiguracionbd());
            em = emf.createEntityManager();
        }
        return em;
    }
}
