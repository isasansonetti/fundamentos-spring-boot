package com.practica.springboot.practicaSpringBoot.configuration;

import com.practica.springboot.practicaSpringBoot.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationSum(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
