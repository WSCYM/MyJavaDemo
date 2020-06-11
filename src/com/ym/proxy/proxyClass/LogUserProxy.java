package com.ym.proxy.proxyClass;

import com.ym.proxy.dao.UserDaoImpl;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName LogUserProxy
 * @Description TODO
 * @createTime 2020-06-10 15:08:00
 */
public class LogUserProxy extends UserDaoImpl {
    @Override
    public void login(String name) {
        System.out.println("log.....");
        System.out.println(name + "login success");
    }
}
