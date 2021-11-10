package org.example.dao;


import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;

@Repository
@Transactional
public class UserDaoEntityManagerImpl implements UserDao{


    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager entityManager;

    @Override
    public List<User> index() {
        List<User> list = entityManager.createQuery("select a from User a",User.class).getResultList();
        return list;
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User read(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class,id));
    }
}
