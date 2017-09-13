package com.hainet.spring.thymeleaf.vuejs.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringThymeleafVuejsSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringThymeleafVuejsSampleApplication.class, args);
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("title", SpringThymeleafVuejsSampleApplication.class.getSimpleName());
        return "index";
    }
}
