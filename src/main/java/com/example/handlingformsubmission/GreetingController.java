package com.example.handlingformsubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @Autowired
    JdbcTemplate jdbc;
    @Autowired
    private PepoleRespository pepoleRespository;

    private Pepole pepole;
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        pepole = new Pepole();
        pepole.setId(greeting.getId());
        pepole.setMessage(greeting.getContent());
        pepoleRespository.save(pepole);


        model.addAttribute("greeting", pepoleRespository.findAll());
        System.out.println(pepoleRespository.findAll());
        return "result";
    }

}

