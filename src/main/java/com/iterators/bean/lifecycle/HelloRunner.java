package com.iterators.bean.lifecycle;

import com.iterators.bean.lifecycle.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author iterators
 * @time 2020.05.11
 */
public class HelloRunner implements ApplicationRunner {

    @Autowired
    HelloWorldService helloWorldService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        helloWorldService.sayHello();
    }
}
