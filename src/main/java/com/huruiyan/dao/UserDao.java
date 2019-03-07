package com.huruiyan.dao;

import com.huruiyan.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    //查询所有用户
    @Select("select * from user")
    public List<User> findAll();
    //保存用户
    @Insert("insert into user (name,money) values (#{name},#{money})")
    public void saveUser(User user);
}
