package com.gf.service.impl;


import com.gf.entity.UserAddress;
import com.gf.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceStub implements UserService{

    private final UserService userService;

    // 构造函数传入真正的远程代理对象
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub ...");
        // 此代码在客户端执行, 你可以在客户端做ThreadLocal本地缓存，或预先验证参数是否合法，等等
        if (!StringUtils.isEmpty( userId )) {
            return userService.getUserAddressList( userId );
        }

        // 你可以容错，可以做任何AOP拦截事项
        return null;

    }
}
