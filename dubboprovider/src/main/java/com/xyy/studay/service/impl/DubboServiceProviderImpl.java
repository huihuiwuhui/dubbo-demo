package com.xyy.studay.service.impl;

import com.xyy.studay.service.DubboServiceProvider;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/6/13 19:30
 * @Description:
 */
@Component("dubboServiceProvider")
public class DubboServiceProviderImpl implements DubboServiceProvider {
    @Override
    public String say(String name) {
        return "hello"+ name;
    }
}
