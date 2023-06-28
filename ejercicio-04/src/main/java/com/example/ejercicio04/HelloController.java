package com.example.ejercicio04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String saludo(){
        return "Hola mundo!!!";
    }
}
