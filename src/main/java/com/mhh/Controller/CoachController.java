package com.mhh.Controller;

import com.mhh.Service.CoachService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor//represent for constructor
public class CoachController {
    private CoachService coachService;

    @Autowired
    public void setCoachService(CoachService coachService) {
        this.coachService = coachService;
    }

//    // we don't have to use set method for the name of inject method
//    @Autowired
//    public void doCoach(CoachService coachService) {
//        this.coachService = coachService;
//    }

    @GetMapping("/dailywork")
    public String getDailyWork() {
        return coachService.getWorkout();
    }

}
