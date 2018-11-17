package com.gf.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.gf.entity.UserAddress;
import com.gf.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService{


    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        List<UserAddress> list = new ArrayList<>();
        UserAddress address1 = new UserAddress(1 , "上海市杨浦区xxx路xxx号" , "1" , "王某某","0");
        UserAddress address2 = new UserAddress(2 , "上海市徐汇区xxx路xxx号" , "1" , "张某某","1");

        list.add( address1 );
        list.add( address2 );

        return list;
    }
}
