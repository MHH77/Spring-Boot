package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class BaseballCoachImpl implements CoachService {

    public BaseballCoachImpl() {
        System.out.println("BaseballCoachImpl is created");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("BaseballCoachImpl doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("BaseballCoachImpl doMyCleanupStuff");
    }


    @Override
    public String getWorkout() {
        return "baseball coach send workout!";
    }
}
