package com.dice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/hello")
    public Person hello(@RequestParam(value="name", defaultValue="World") String name) {
        return new Person(String.format(template, name));
    }
}