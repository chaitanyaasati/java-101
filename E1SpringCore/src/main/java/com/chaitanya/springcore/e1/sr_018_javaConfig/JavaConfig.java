package com.chaitanya.springcore.e1.sr_018_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    //name of method can be anything
    @Bean
    public Address getAddress(){
        return new Address("VirajStreet","Lakshmanpuri");
    }

    @Bean
//    @Scope("prototype")
    public Student getStudent(){
        return new Student(getAddress(), "Lokesh");
    }

    @Bean(name="myname")
    public Student getOtherStudent(){
        return new Student();
    }
}
