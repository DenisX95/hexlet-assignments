package exercise.controller;

import exercise.daytime.Daytime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// BEGIN
@RestController
public class WelcomeController {
    @Autowired
    private Daytime dayTime;

    @GetMapping("/welcome")
    public String sayHello() {
        var text = "It is " + dayTime.getName() + " now! Welcome to Spring!";
        System.out.println(text);
        return text;
    }
}
// END
