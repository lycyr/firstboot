package com.example.firstboot.dao;

import com.example.firstboot.mapper.UserMapper;
import com.example.firstboot.model.User;
import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public User SelectByPrimaryKet(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
