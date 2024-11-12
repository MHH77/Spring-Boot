package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;
import org.springframework.stereotype.Service;

@Service
public class CoachServiceImpl implements CoachService {
    @Override
    public String getWorkout() {
        return "coach send workout!";
    }
}
