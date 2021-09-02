package com.duming.service;

import com.duming.dao.UserMapper;
import com.duming.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
public class UserServiceImpl implements UserService {
//    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
