package br.com.gpiagentini.api.adapters.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/foo")
public class Foo {

    @GetMapping
    public String getFoo(){
        System.out.println("Get Foo");
        return "Hello Foo";
    }

    @PostMapping
    public void saveFoo(){
        System.out.println("Post Foo");
    }
}
