package com.yyu.cms.service.impl;

import com.yyu.cms.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    public int calc(int a, int b) {
        return a + b;
    }
}
