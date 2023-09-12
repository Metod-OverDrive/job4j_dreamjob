package ru.job4j.dreamjob.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

}
