package com.learnspring.taskmanagementapplesson.spring;

//the first thing to do to make this a configuration class for spring context - a bean - is to use configuration annotation
import com.learnspring.taskmanagementapplesson.persistence.repository.impl.ProjectRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /** The @Configuration annotation indicates to Spring that this class needs to be processed by the container
                    because it will contribute bean definitions to it. And the @Bean annotation is one such actual bean definition.
                    in our case, this is bean named projectRepository, as thats the name of the method. */
//we this configuration class we can finally define our bean


public class PersistenceConfig {

    @Bean
    public ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }
}
