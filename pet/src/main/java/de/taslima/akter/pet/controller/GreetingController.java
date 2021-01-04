package de.taslima.akter.pet.controller;

import de.taslima.akter.pet.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    private static final String message= "Hello there! %s";
    @RequestMapping( value = "/greetings",method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World")String name){
        return new Greeting(" Greeting Id 520", String.format(message, name));
    }


}
