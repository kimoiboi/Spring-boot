/* Step 1: Define the dependency interface and class (This is the class) */
package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

/* Uses @Component annotation which marks as a Spring Bean and is allowed for dependency injection */
/* A Spring Bean is a regular java class that is managed by Spring */
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!";
    }
}
