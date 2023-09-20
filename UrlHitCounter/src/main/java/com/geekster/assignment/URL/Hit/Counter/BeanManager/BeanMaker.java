package com.geekster.assignment.URL.Hit.Counter.BeanManager;

import com.geekster.assignment.URL.Hit.Counter.Controller.UrlHitController;
import com.geekster.assignment.URL.Hit.Counter.Entity.UrlHitCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<UrlHitCounter> getUrlHitCounterList(){

        return new ArrayList<>();
    }
}