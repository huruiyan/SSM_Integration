package com.huruiyan.service;

import com.huruiyan.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有用户
    public List<User> findAll();
    //保存用户
    public void saveUser(User user);
}
