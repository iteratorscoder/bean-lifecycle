package com.iterators.bean.lifecycle.processor;

import com.iterators.bean.lifecycle.init.MyInitializingBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author iterators
 * @time 2020.05.09
 */
@Slf4j
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAssignableFrom(MyInitializingBean.class)) {
            log.info("{} before initialization: {}", this.getClass().getSimpleName(), beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAssignableFrom(MyInitializingBean.class)) {
            log.info("{} after initialization: {}", this.getClass().getSimpleName(), beanName);
        }
        return bean;
    }
}
