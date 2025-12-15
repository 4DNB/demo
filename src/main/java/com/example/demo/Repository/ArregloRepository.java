package com.example.demo.Repository;

import org.springframework.data.repository.Repository;

import com.example.demo.Models.Arreglo.Arreglo;

@org.springframework.stereotype.Repository
public interface ArregloRepository extends Repository<Arreglo, Integer> {
    
    Iterable<Arreglo> findAll();

}
