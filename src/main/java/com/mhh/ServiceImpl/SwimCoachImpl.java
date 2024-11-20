package com.mhh.ServiceImpl;

import com.mhh.Service.CoachService;

public class SwimCoachImpl implements CoachService {

    public SwimCoachImpl() {
        System.out.println("In Constructor :  "+ getClass().getName());
    }

    @Override
    public String getWorkout() {
        return "Swim ,Swim  and Swim Again !!!";
    }
}
