package org.example.dao;

import org.example.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    void save(User user);
    User read(int id);
    void update(User user);
    void delete(User user);
}
