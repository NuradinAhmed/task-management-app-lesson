package com.learnspring.taskmanagementapplesson;

import javax.annotation.PostConstruct;

public class BeanA {
    /** Spring will run methods annotated with @PostConstruct only once, just after the initialization of the bean properties*/
    @PostConstruct
    public  void post(){

    }
}
