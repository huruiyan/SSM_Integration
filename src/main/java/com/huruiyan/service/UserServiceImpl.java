package com.huruiyan.service;

import com.huruiyan.dao.UserDao;
import com.huruiyan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        userDao.findAll();
        System.out.println("service 查询所有用户信息");
        return null;
    }

    @Override
    public void saveUser(User user) {
        System.out.println("service 保存用户");
    }
}
