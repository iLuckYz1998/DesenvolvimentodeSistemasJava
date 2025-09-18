package com.example.projeto3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String mensage(){
        return "Bem-Vindo";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Desenvolvedor(a): Lucas Santiago";
    }


}
