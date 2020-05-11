package com.iterators.bean.lifecycle.selector;

import com.iterators.bean.lifecycle.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.NonNull;

/**
 * selectImports参数importingClassMetadata指的是哪个类通过注解引入了HelloWorldSelector，此处是AppConfig
 * @author iterators
 * @time 2020.05.11
 */
@Slf4j
public class HelloWorldSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        log.info("{} importingClassMetadata info: {}",
                HelloWorldSelector.class.getSimpleName(),
                importingClassMetadata.toString());
        // 打印出importingClassMetadata具有的所有注解的信息
        importingClassMetadata.getAnnotations().forEach((HelloWorldSelector::logInfo));
        // 获取注解属性值
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(EnableAutoHelloWorldConfiguration.class.getName(), false));
        if (attributes != null) {
            attributes.forEach((key, value) -> {
                log.info("key: {}, value: {}", key, value);
            });
        }
        String autoHello = HelloWorldService.class.getName();
        return new String[]{autoHello};
    }

    public static void logInfo(@NonNull MergedAnnotation annotation) {
        if (annotation.isDirectlyPresent()) {
            log.info("Directly present annotation info: {}", annotation.getType().getSimpleName());
        } else {
            log.info("Indirectly present annotation info: {}", annotation.getType().getSimpleName());
        }

    }
}
