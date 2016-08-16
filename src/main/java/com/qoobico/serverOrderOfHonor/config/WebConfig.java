package com.qoobico.serverOrderOfHonor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by DENIS on 22.08.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.qoobico.serverOrderOfHonor")
public class WebConfig extends WebMvcConfigurerAdapter {
}
