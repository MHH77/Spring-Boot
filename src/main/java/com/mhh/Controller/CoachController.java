package com.mhh.Controller;

import com.mhh.Service.CoachService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@Setter
public class CoachController {

    private final CoachService coachService;

    //set the implementation that I want to inject
    public CoachController(@Qualifier("baseballCoachImpl") CoachService coachService) {
        this.coachService = coachService;
    }

    @GetMapping("/dailywork")
    public String getDailyWork() {
        return coachService.getWorkout();
    }

}
