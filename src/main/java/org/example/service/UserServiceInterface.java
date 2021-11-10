package org.example.service;

import org.example.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserServiceInterface {
    List<User> index();
    void save(User user);
    User read(int id);
    void update(User user);
    void delete(User user);
}
