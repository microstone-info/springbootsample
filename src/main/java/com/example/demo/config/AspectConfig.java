package com.example.demo.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ComponentScan;
// Usually can add one config class to enable this autoproxy

@ComponentScan("com.example.demo.log")
@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {
    
}
