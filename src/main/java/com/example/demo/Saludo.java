package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Saludo {
    private int id;
    private String mensaje;

    public Saludo(int id, String mensaje) {
        this.id = id;
        this.mensaje = mensaje;
    }
}
