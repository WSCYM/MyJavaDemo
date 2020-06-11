package com.ym.proxy.proxyClass;

import com.ym.proxy.dao.UserDao;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName LoginUserProxy2
 * @Description TODO
 * @createTime 2020-06-10 15:13:00
 */
public class LoginUserProxy2 implements UserDao {

    private UserDao userDao;

    public LoginUserProxy2(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void login(String name) {

        System.out.println("log.....");
        userDao.login(name);

    }

}
