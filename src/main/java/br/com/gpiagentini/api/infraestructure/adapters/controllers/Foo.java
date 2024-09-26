package br.com.gpiagentini.api.infraestructure.adapters.controllers;

import br.com.gpiagentini.api.infraestructure.persistence.respository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/foo")
public class Foo {

    @Autowired
    private FooRepository fooRepository;

    @GetMapping
    public String get(){
        System.out.println("Getting Foo");
        var foo = fooRepository.findById(1L).orElse(null);
        if(foo != null)
            return foo.getName();
        return "";
    }

    @PostMapping
    public void save(){
        System.out.println("Post Foo");
    }
}
