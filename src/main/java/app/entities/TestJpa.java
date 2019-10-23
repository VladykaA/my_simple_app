package app.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestJpa {
    public static void main(String[] args) {

        User user = new User("Jack", "123456");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(user);

        transaction.commit();

        em.close();

        factory.close();
    }
}
