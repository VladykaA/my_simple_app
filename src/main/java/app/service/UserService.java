package app.service;

import app.entities.User;
import javax.persistence.*;
import java.util.List;

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

        Query query = em.createQuery("SELECT * from learn_jpa.user WHERE name ='" + name + "';", User.class);

//        User u = em.find()
//
//        em.remove(u);

        transaction.commit();

        em.close();
    }

    @Override
    public List<User> getAll() {
        EntityManager em = FACTORY.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        Query query = em.createQuery("from User u", User.class);

        transaction.commit();

        em.close();

        return query.getResultList();
    }
}
