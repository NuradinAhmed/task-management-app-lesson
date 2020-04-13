package com.learnspring.taskmanagementapplesson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    /** We can customize the bean initialization process: by 1: Adding a method in the bean class annotated with @PostConstruct
     *                                                       2: Invoke a particular of the class using the initMethod parameter of the @Bean annotation*/
    @Bean(initMethod = "initialize")
    public BeanB beanB() {
        return new BeanB();
    }
}
