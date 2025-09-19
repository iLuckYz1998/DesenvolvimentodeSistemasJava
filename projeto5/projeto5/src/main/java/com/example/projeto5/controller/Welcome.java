package com.example.projeto5.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String Welcome(){
        return "Bem-Vindo";
    }

    @GetMapping("/dev")
    public String dev (){
        return "Desenvolvedor(a): Lucas";
    }

}
