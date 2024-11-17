package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class BaseballCoachImpl implements CoachService {

    //this component is created at run time even I set it @lazy , because
    //in controller I need it and (constructor injection) so spring create it at run time and
    //inject it...but when set lazy globally it not create !!!!
    public BaseballCoachImpl() {
        System.out.println("BaseballCoachImpl is created");
    }

    @Override
    public String getWorkout() {
        return "baseball coach send workout!";
    }
}
