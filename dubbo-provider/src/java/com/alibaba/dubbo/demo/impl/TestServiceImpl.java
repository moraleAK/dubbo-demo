package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.TestService;

/**
 * Created by Ak_Guili on 2017/7/24.
 */
public class TestServiceImpl implements TestService {
    @Override
    public String dubboTest() {
        return "This is a test!";
    }
}
