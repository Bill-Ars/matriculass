package com.gestao.matriculass.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {


    @RequestMapping("/")
    public String greet(){
        return "Seja bem vindo ao sistema de Gestao de matriculas.";
    }
}
