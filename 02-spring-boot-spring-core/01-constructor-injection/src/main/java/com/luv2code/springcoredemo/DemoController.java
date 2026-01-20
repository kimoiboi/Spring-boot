/* Step 2: Create Demo REST Controller */
package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    /* Step 3: Create a constructor in our class for Injections */
    // define a constructor for dependency injection (@Autowired annotation tells spring to inject a dependency -- Optional if only one constructor present)
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    /* Step 4: Add @GetMapping for /dailyworkout */
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}






