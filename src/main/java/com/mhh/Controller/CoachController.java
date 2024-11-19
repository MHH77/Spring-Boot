package com.mhh.Controller;

import com.mhh.Service.CoachService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@Setter
public class CoachController {

    private final CoachService coachService;

    public CoachController(@Qualifier("baseballCoachImpl") CoachService coachService
    ) {
        this.coachService = coachService;

    }

    @GetMapping("/dailywork")
    public String getDailyWork() {
        return coachService.getWorkout();
    }

}
