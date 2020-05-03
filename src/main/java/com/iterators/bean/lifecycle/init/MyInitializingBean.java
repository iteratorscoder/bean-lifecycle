package com.iterators.bean.lifecycle.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import javax.annotation.PostConstruct;

/**
 * @author iterators
 * @time 2020.05.03
 */
@Slf4j
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

    /**
     * {@link CommonAnnotationBeanPostProcessor}和{@link InitDestroyAnnotationBeanPostProcessor} 会处理注解@PostConstruct 和@PreDeatory
     * 处理流程在{@link AbstractAutowireCapableBeanFactory#initializeBean(java.lang.String, java.lang.Object, org.springframework.beans.factory.support.RootBeanDefinition)}的
     * 的代码 wrappedBean = applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
     */
    @PostConstruct
    public void init() {
        log.info("{} exec init code", TAG);
    }

    public void initMethod() {
        log.info("{} exec init-method code", TAG);
    }

    public void destroyMethod() {
        log.info("{} exec destroy-method code", TAG);
    }
}
