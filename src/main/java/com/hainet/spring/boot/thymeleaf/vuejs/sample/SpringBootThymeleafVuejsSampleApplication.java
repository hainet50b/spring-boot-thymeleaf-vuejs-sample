package com.hainet.spring.boot.thymeleaf.vuejs.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootThymeleafVuejsSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafVuejsSampleApplication.class, args);
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("title", SpringBootThymeleafVuejsSampleApplication.class.getSimpleName());
        return "index";
    }
}
