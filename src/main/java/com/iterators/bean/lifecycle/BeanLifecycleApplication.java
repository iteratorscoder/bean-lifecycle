package com.iterators.bean.lifecycle;

import com.iterators.bean.lifecycle.cicular.MyCircularReferenceA;
import com.iterators.bean.lifecycle.cicular.MyCircularReferenceB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author iterators
 */
@SpringBootApplication
public class BeanLifecycleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BeanLifecycleApplication.class, args);
        MyCircularReferenceA circularReferenceA = context.getBean(MyCircularReferenceA.class);
        MyCircularReferenceB circularReferenceB = context.getBean(MyCircularReferenceB.class);
        circularReferenceA.say();
        circularReferenceB.say();
        context.close();
    }

}
