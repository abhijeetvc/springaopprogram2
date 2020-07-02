package com.aop.springaopprogram2.impl;

import com.aop.springaopprogram2.repository.DemoInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoImpl implements DemoInterface {
    @Override
    public String doSomething() {
        System.out.println("11111111111111");
        return "Hello AOP";
    }
}
