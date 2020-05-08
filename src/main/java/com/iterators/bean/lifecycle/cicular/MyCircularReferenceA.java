package com.iterators.bean.lifecycle.cicular;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author iterators
 * @time 2020.05.08
 */
@Component
@Slf4j
public class MyCircularReferenceA {

    @Autowired
    public MyCircularReferenceB myCircularReferenceB;


    public void say() {
        log.info("{} say.", this.getClass().getSimpleName());
    }
}
