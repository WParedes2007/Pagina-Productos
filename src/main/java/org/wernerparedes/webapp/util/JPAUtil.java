
package org.wernerparedes.webapp.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory emf = buildEntityManagerFactory();
    
    public static EntityManagerFactory buildEntityManagerFactory(){
        try{
            return Persistence.createEntityManagerFactory("SGBDProductoIN5CV");
        }catch(Throwable e){
           e.printStackTrace();
           throw new ExceptionInInitializerError(e);
        }
    }
    
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public static void close(){
        emf.close();    
    }
}
