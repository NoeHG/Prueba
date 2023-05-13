package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value =  "saludo")
public class SaludoController {

    //http://localhost:8080/saludo?nombre=NOE
    @GetMapping
    public Saludo saludar(@RequestParam(value = "nombre", defaultValue = "extraño") String nombre){
        return new Saludo(1, "Hola mundo " + nombre);
    }
}
