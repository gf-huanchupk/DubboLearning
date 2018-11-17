package com.gf.service;


import com.gf.entity.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getUserAddressList(String userId);

}
