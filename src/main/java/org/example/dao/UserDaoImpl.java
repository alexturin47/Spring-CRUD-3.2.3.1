//package org.example.dao;
//
//import org.example.model.User;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//
//@Repository
//@Transactional
//public class UserDaoImpl{
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Transactional(readOnly = true)
// //   @Override
//    public List<User> index() {
//        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//        return query.getResultList();
//    }
//
////    @Override
//    public void save(User user) {
//        sessionFactory.getCurrentSession().save(user);
//    }
//
////    @Override
//    public User read(int id) {
//        return sessionFactory.getCurrentSession().get(User.class, id);
//    }
//
// //   @Override
//    public void update(int id, User user) {
//        sessionFactory.getCurrentSession().update(user);
//    }
//
// //   @Override
//    public void delete(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        User user = session.load(User.class, id);
//        session.delete(user);
//    }
//}
