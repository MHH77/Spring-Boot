package com.mhh.Controller;

import com.mhh.Service.CoachService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CoachController {

    @Autowired
    private CoachService coachService;//make the code harder to unit test

    @GetMapping("/dailywork")
    public String getDailyWork() {
        return coachService.getWorkout();
    }

}
