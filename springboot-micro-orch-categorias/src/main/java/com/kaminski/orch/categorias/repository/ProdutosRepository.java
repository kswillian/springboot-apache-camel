package com.kaminski.orch.categorias.repository;

import com.kaminski.orch.categorias.domain.Produto;

import java.util.List;

public interface ProdutosRepository {

    List<Produto> findProdutos();

}