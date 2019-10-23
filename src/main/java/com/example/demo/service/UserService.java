package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * Created by niuzl on 2019/10/23.
 */

public interface UserService {
    void save(User user);
    User getUser(String id);
    boolean updateByPrimaryKey(User user);
    boolean deleteByPrimaryKey(String id);
}
