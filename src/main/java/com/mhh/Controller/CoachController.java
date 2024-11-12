package com.mhh.Controller;

import com.mhh.Service.CoachService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor//represent for constructor
public class CoachController {
    private final CoachService coachService;

    @GetMapping("/dailywork")
    public String getDailyWork() {
        return coachService.getWorkout();
    }

}
