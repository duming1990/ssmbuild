package com.duming.dao;

import com.duming.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface UserMapper {
    List<User> getUserList();
}
