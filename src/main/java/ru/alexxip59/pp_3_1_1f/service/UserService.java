package ru.alexxip59.pp_3_1_1f.service;

import ru.alexxip59.pp_3_1_1f.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    User showUser(Long id);
    void addUser(User user);
    void removeUser(Long id);
    void updateUser(Long id, User user);

}
