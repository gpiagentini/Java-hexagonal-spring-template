package br.com.gpiagentini.api.adapters.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bar")
public class Bar {

    @GetMapping
    public String getBar(){
        System.out.println("Get Bar");
        return "Hello Bar";
    }

    @PostMapping
    public void saveBar(){
        System.out.println("Post Bar");
    }
}
