package com.iterators.bean.lifecycle.circular;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author iterators
 * @time 2020.05.08
 */
@Component
@Slf4j
public class MyCircularReferenceB {

    @Autowired
    private MyCircularReferenceA myCircularReferenceA;


    public void say() {
        log.info("{} say.", this.getClass().getSimpleName());
    }
}
