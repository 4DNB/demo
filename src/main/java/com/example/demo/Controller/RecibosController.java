package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.ClassA;

@RestController
@RequestMapping(path = "/recibo")
public class RecibosController {

    @GetMapping("/")
    public ClassA d() {

        ClassA a = new ClassA();
        a.x = "VALOR X";

        return a;
    }

}
