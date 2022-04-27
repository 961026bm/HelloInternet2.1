package com.careerdevs.hellointernet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    private String helloCareerDevs() {
        return "You requested the root route";
    }
    @GetMapping("/hello")
    private String helloRoute() {
        return "Hello CareerDevs!!!!";
    }
    @GetMapping ("/random")
    public int randomRoute() {
        return (int) (Math.random() * 100) + 1;
    }

    //Create a route handler that returns a random number between 1 and 100

   // When the user requests the url https://localhost:8080/random in the browser or Postman, your server should respond with a random number from 1 - 100
}
