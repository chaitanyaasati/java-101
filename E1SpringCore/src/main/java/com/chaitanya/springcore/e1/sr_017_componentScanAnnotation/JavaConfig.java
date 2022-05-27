package com.chaitanya.springcore.e1.sr_017_componentScanAnnotation;

import com.chaitanya.springcore.e1.sr_018_javaConfig.Address;
import com.chaitanya.springcore.e1.sr_018_javaConfig.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.chaitanya.springcore.e1.sr_017_componentScanAnnotation")
public class JavaConfig {

}
