package com.example.working;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String home() {
        return """
		<font color=red><h1>Welcome all to CI/CD example changed
		""";
    }
}
