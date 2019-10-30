package app.service;

import app.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserService implements CRUDService<User> {

    public static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("test_jpa");

    @Override
    public void save(User user) {

        EntityManager em = FACTORY.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(user);

        transaction.commit();

        em.close();
    }

    @Override
    public void update(User user) {
//        EntityManager em = FACTORY.createEntityManager();
//
//        EntityTransaction transaction = em.getTransaction();
//
//        transaction.begin();
//
//        em.merge(user);
//
//        transaction.commit();
//
//        em.close();

    }

    @Override
    public void deleteById(String name, String pass) {
        EntityManager em = FACTORY.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();



//        User u = em.find()
//
//        em.remove(u);

        transaction.commit();

        em.close();
    }

    @Override
    public void getAll() {
        EntityManager em = FACTORY.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();


    }
}
