package com.example.provajava.repository;

import com.example.provajava.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, String> {
}
