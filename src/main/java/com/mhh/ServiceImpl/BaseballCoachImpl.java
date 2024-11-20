package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;
import org.springframework.stereotype.Service;

@Service
public class BaseballCoachImpl implements CoachService {

    public BaseballCoachImpl() {
        System.out.println("BaseballCoachImpl is created");
    }

    @Override
    public String getWorkout() {
        return "baseball coach send workout!";
    }
}
