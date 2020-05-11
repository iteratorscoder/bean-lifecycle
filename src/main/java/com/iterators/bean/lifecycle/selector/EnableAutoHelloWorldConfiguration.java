package com.iterators.bean.lifecycle.selector;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * note: 自定义注解一定要添加注解的生命周期Retention和作用对象Target
 *
 * @author iterators
 * @time 2020.05.11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(HelloWorldSelector.class)
public @interface EnableAutoHelloWorldConfiguration {

    String name() default "";
}
