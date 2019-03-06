package com.example.firstboot.service;

import com.example.firstboot.dao.UserDao;
import com.example.firstboot.mapper.UserMapper;
import com.example.firstboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User GetUser(int id){
        return userDao.SelectByPrimaryKet(id);
    }

    public boolean createUser(User user){
        if (user == null)
            return false;

        return true;
    }
}
