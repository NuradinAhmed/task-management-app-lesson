package com.learnspring.taskmanagementapplesson.service.impl;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContextIntegrationTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void whenContextisLoaded_thenNoExceptions(){
        //
    }


    @Test
    public void whenContextisLoaded_thenNoExceptions2(){
        //
    }

}
