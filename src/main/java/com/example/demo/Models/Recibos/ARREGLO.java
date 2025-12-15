package com.example.demo.Models.Recibos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ARREGLO {

    @Id
    public Integer ARREGLO;
    public Integer DIGITO;
    public String LETRA;

    public ARREGLO() {
    };
    
}

