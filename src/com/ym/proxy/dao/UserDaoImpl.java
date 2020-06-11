package com.ym.proxy.dao;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName UserDao
 * @Description TODO
 * @createTime 2020-06-10 15:04:00
 */
public class UserDaoImpl implements UserDao{

    public void login(String name) {
        System.out.println(name + " login success");
    }
}
