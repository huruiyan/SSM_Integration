package com.huruiyan.test;

import com.huruiyan.service.UserService;
import com.huruiyan.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: huruiyan
 * @Date: 2019/3/7 7:40 PM
 * @Version 1.0
 */
public class TestSpring {
    @Test
    public void run(){
        //加载Spring配置文件
        ApplicationContext ac =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        UserService userService = (UserService) ac.getBean("userService");
        //调用方法
        userService.findAll();
    }
}
