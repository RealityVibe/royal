package com.example.royal.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.example.core.facade.CallbackFacade;
import com.example.core.facade.CallbackListener;
import com.example.core.facade.DubboFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by yze on 2019/10/17
 * @see
 * @since 20191025
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class DubboController {


    @Autowired
    private DubboFacade dubboFacade;

    @Autowired
    private CallbackFacade callbackFacade;

    @RequestMapping("callback")
    public void callBack() {
        //Dubbo 将基于长连接生成反向代理，这样就可以从服务器端调用客户端逻辑 [1]。可以参考 dubbo 项目中的示例代码。
        callbackFacade.addListener("foo.bar", new CallbackListener(){
            public void changed(String msg) {
                System.out.println("callback1:" + msg);
            }
        });
    }


    @RequestMapping("hello2")
    public List<String> sayHello() {
        // 回声测试可用性
//        String status = (String) echoService.$echo("OK");
//
//        assert(status.equals("OK"));
        List<String> list = new ArrayList<>();
        if (dubboFacade == null) {
            list.add("dubbo is null");
            return list;
        }
        return dubboFacade.sayHello();
    }


}
