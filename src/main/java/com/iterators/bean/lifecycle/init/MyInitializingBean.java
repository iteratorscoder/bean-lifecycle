package com.iterators.bean.lifecycle.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author iterators
 * @time 2020.05.03
 */
@Slf4j
@Component
public class MyInitializingBean implements InitializingBean {

    static {
        log.info("{} exec static block code", MyInitializingBean.class.getName());
    }

    public MyInitializingBean() {
        log.info("{} exec ctor code", MyInitializingBean.class.getName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("{} exec afterPropertiesSet code", MyInitializingBean.class.getName());
    }
}
