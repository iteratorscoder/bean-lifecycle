package com.iterators.bean.lifecycle.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author iterators
 * @time 2020.05.11
 */
@Slf4j
public class HelloWorldService {
    public void sayHello() {
      log.info("{} say: hello!", this.getClass().getSimpleName());
    }
}
