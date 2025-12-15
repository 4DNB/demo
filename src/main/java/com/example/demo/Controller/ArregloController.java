package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Arreglo.Arreglo;
import com.example.demo.Repository.ArregloRepository;

@RestController
@RequestMapping(path = "/arreglo")
public class ArregloController {

    private ArregloRepository _service;

    public ArregloController(ArregloRepository service) {
        _service = service;
    }

    @GetMapping("")
    public Iterable<Arreglo> d() {

        Iterable<Arreglo> a = _service.findAll();

        return a;
    }

}
