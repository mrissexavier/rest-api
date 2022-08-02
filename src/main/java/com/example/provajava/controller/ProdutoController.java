package com.example.provajava.controller;

import com.example.provajava.domain.Produto;
import com.example.provajava.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/listCars")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> listAll(){
        return service.listAll();
    }

    @PostMapping
    public Produto createCar(@RequestBody Produto produto){
        return service.createCar(produto);
    }

}
