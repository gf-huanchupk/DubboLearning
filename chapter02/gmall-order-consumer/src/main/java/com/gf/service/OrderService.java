package com.gf.service;


import com.gf.entity.UserAddress;

import java.util.List;

public interface OrderService {

    List<UserAddress> initOrder(String userId);

}
