package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by niuzl on 2019/10/23.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.insert(user) ;
    }

    @Override
    public User getUser(String id){
        return userDao.selectByPrimaryKey(Integer.valueOf(id));
    }

    @Override
    public boolean updateByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user) > 0;
    }

    @Override
    public boolean deleteByPrimaryKey(String id) {
        return userDao.deleteByPrimaryKey(Integer.valueOf(id)) > 0;
    }
}