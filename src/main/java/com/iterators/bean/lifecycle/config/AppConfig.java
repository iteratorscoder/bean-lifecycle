package com.iterators.bean.lifecycle.config;

import com.iterators.bean.lifecycle.init.MyInitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author iterators
 * @time 2020.05.03
 */
@Configuration
public class AppConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MyInitializingBean myInitializingBean() {
        return new MyInitializingBean();
    }
}
