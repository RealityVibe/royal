package com.example.royal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author by yze on 2019/10/17
 * @see
 * @since 20191025
 */
@Configuration
@ImportResource("classpath:dubbo/dubbo-consumer.xml")
public class DubboConfig {

}