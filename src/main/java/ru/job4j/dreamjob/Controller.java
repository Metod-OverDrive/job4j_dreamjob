package ru.job4j.dreamjob;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/index")
    public String getIndex() {
        return "index.html";
    }

}
