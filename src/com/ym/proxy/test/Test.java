package com.ym.proxy.test;

import com.ym.proxy.dao.UserDao;
import com.ym.proxy.dao.UserDaoImpl;
import com.ym.proxy.proxyClass.LogUserProxy;
import com.ym.proxy.proxyClass.LoginUserProxy2;
import sun.rmi.runtime.Log;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Test
 * @Description TODO
 * @createTime 2020-06-10 15:10:00
 */
public class Test {

    public static void main(String[] args) {
//        UserDaoImpl userDao = new LogUserProxy();
//        userDao.login("ym");

        UserDao userDao = new UserDaoImpl();
        UserDao proxy = new LoginUserProxy2(userDao);
        proxy.login("ym");
    }

}
