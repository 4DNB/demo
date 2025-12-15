package com.example.demo.Models.Arreglo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Arreglo {

    @Id
    public int Arreglo;
    public int Digito;    

    public Arreglo() {
    };
    
}

