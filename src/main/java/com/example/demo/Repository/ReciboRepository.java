package com.example.demo.Repository;

import org.springframework.data.repository.Repository;

import com.example.demo.Models.Recibos.ARREGLO;

@org.springframework.stereotype.Repository
public interface ReciboRepository extends Repository<ARREGLO, Integer> {
    
    Iterable<ARREGLO> findAll();

}
