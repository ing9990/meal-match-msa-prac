package com.mealmatch.userservice.test;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class Controller {

    private final Environment env;

    @GetMapping
    public String test() {
        return "Hello this is " + env.getProperty("server.port") + " !!   " + env.getProperty("user.greeting") + env.getProperty("hello.world");
    }
}
