package com.James.demo.Service;

import java.util.List;

import com.James.demo.Entity.User;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User insertByUser(User user);

    User update(User user);

    User delete(Long id);
}
