package com.georgeraptis.crm.service;

import com.georgeraptis.crm.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    User getUserByEmail(String email);
}
