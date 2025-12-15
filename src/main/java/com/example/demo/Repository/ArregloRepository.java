package com.example.demo.Repository;

import org.springframework.data.repository.Repository;

import com.example.demo.Models.Arreglo.Arreglo;

public interface ArregloRepository extends Repository<Arreglo, Integer> {
    
    Iterable<Arreglo> findAll();
    

}
