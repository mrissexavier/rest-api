package com.example.provajava.service;

import com.example.provajava.domain.Produto;
import com.example.provajava.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listAll(){
        return (List<Produto>) repository.findAll();
    }

    public Produto createCar(Produto produto){
        return repository.save(produto);
    }

}
