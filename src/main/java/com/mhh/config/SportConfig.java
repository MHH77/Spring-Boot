package com.mhh.config;

import com.mhh.Service.CoachService;
import com.mhh.ServiceImpl.SwimCoachImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("swim")// if wa dont set the name the default of bean id is method name
    public CoachService swimCoach() {
        return new SwimCoachImpl();
    }
}
