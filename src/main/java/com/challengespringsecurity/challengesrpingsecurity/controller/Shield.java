package com.challengespringsecurity.challengesrpingsecurity.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Shield {
    @GetMapping("/")
    public String user() {
        return "Welcome to the SHIELD";
    }


    @GetMapping("/avengers/assemble")
    public String champions() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "ok";
    }
}



