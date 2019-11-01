package com.example.royal.stubs;

import com.example.core.facade.DubboFacade;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by yze on 2019/10/23
 * @see
 * @since 20191024
 */
public class DubboFacadeStub implements DubboFacade {

    private DubboFacade dubboFacade;

    // 必须提供，dubbo框架会在消费者这一方调用这个方法
    public DubboFacadeStub(DubboFacade dubboFacade) {
        this.dubboFacade = dubboFacade;
    }

    @Override
    public List<String> sayHello() {
        try{
           return dubboFacade.sayHello();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
