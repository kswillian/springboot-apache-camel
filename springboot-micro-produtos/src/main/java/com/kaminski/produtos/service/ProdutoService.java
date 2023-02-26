package com.kaminski.produtos.service;

import com.kaminski.produtos.domain.Produto;
import com.kaminski.produtos.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private static final Logger logger = LogManager.getLogger(ProdutoService.class);

    public Produto cadastrar(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> consultarTodosProdutos(){
        return produtoRepository.findAll();
    }

    public List<Produto> consultarPorCodigoCategoria(Long codigoCategoria){
        return produtoRepository.findProdutoByCodigoCategoria(codigoCategoria);
    }

}