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
    private final CoachService anotherCoachService;

    public CoachController(@Qualifier("baseballCoachImpl") CoachService coachService,
                           @Qualifier("baseballCoachImpl") CoachService anotherCoachService) {
        this.coachService = coachService;
        this.anotherCoachService = anotherCoachService;
    }

    @GetMapping("/dailywork")
    public String getDailyWork() {
        return coachService.getWorkout();
    }

    @GetMapping("/check")
    public String chck() {
        // if singleton => true
        // if prototype +> false
        return "Comparing beans : coachService == anotherCoachService ," + (coachService == anotherCoachService);
    }
}
