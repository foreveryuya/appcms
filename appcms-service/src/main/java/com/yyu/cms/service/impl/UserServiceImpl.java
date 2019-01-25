package com.yyu.cms.service.impl;

import com.yyu.cms.dao.mapper.UserMapper;
import com.yyu.cms.domain.po.User;
import com.yyu.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public boolean add(User user) {
        return userMapper.insert(user) > 0 ? true : false;
    }

    public List<User> list() {
        return userMapper.selectByExample(null);
    }
}
