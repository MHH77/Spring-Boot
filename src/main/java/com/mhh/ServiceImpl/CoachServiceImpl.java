package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CoachServiceImpl implements CoachService {

    //it's not create in run time
    public CoachServiceImpl() {
        System.out.println("CoachServiceImpl is created");
    }

    @Override
    public String getWorkout() {
        return "coach send workout!";
    }
}
