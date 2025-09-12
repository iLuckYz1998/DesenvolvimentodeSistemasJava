package com.example.projeto2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String Welcome(){
        return "Bem-vindo";
    }

    @GetMapping("/senai")
    public String Lucas(){
        return "Lucas & LuckY";
    }

}
