package com.iterators.bean.lifecycle.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author iterators
 * @time 2020.05.03
 */
@Slf4j
@Component
public class MyInitializingBean implements InitializingBean {

    public static final String TAG = MyInitializingBean.class.getSimpleName();

    static {
        log.info("{} exec static block code", TAG);
    }

    public MyInitializingBean() {
        log.info("{} exec ctor code", TAG);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("{} exec afterPropertiesSet code", TAG);
    }

    @PostConstruct
    public void init() {
        log.info("{} exec init code", TAG);
    }
}
