package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Recibos.ARREGLO;
import com.example.demo.Repository.ReciboRepository;

@RestController
@RequestMapping(path = "/recibo")
public class RecibosController {

    private ReciboRepository _service;

    public RecibosController(ReciboRepository service) {
        _service = service;
    }

    @GetMapping("/")
    public Iterable<ARREGLO> d() {

        Iterable<ARREGLO> a = _service.findAll();

        return a;
    }

}
