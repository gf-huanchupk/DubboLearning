package com.gf.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gf.entity.UserAddress;
import com.gf.service.OrderService;
import com.gf.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference(stub = "com.gf.service.impl.UserServiceStub")
    UserService userService;


    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println( "用户id : " + userId );
        //查询用户地址
        List<UserAddress> addressList = userService.getUserAddressList( userId );
        return addressList;
    }
}

