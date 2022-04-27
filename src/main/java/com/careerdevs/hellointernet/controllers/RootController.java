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
    //Create a route handler that returns a random number between 1 and 100

    // When the user requests the url https://localhost:8080/random in the browser or Postman, your server should respond with a random number from 1 - 100

    @GetMapping ("/random")
    public int randomRoute() {
        return (int) (Math.random() * 100) + 1;
    }
/*
When the user requests the url https://localhost:8080/joke in the browser or Postman, your server should respond with a random joke. Create your own jokes or find a website/book that has some short joke you can take from

need help with this request it doesn't WORK
 */
    @GetMapping ("/joke")
    public String jokesRoute () {
        String[] jokes = {"My jokes are always dry, \n pls get me water", "Was told cover sheet never has pocket \n not in America", "Oliver twist people hand to get \n more food", "The best place to be is in \n the valley"};
        int jokeIndex = (int) (Math.random() * jokes.length);
        return  jokes[jokeIndex];
    }

}
