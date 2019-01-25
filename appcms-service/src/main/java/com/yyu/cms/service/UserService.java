package com.yyu.cms.service;

import com.yyu.cms.domain.po.User;

import java.util.List;

public interface UserService {
    boolean add(User user);

    List<User> list();
}
