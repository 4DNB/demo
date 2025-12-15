package com.example.demo.Models.Arreglo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Arreglo {

    @Id
    public Integer ARREGLO;
    public Integer DIGITO;
    public String LETRA;

    public Arreglo() {
    };
    
}

