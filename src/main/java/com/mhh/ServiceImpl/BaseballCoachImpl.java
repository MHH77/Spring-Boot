package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoachImpl implements CoachService {

    public BaseballCoachImpl() {
        System.out.println("BaseballCoachImpl is created");
    }

    @Override
    public String getWorkout() {
        return "baseball coach send workout!";
    }
}
