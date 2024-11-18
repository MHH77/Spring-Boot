package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;
import org.springframework.stereotype.Service;

@Service
public class CoachServiceImpl implements CoachService {


    public CoachServiceImpl() {
        System.out.println("CoachServiceImpl is created");
    }

    @Override
    public String getWorkout() {
        return "coach send workout!";
    }
}
