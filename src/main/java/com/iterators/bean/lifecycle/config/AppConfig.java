package com.iterators.bean.lifecycle.config;

import com.iterators.bean.lifecycle.HelloRunner;
import com.iterators.bean.lifecycle.init.MyInitializingBean;
import com.iterators.bean.lifecycle.selector.EnableAutoHelloWorldConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author iterators
 * @time 2020.05.03
 */
@Configuration
@EnableAutoHelloWorldConfiguration(name = "iterators")
public class AppConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MyInitializingBean myInitializingBean() {
        return new MyInitializingBean();
    }

    @Bean
    public HelloRunner helloRunner() {
        return new HelloRunner();
    }
}
