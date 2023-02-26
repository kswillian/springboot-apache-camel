package com.kaminski.produtos.controller;

import com.kaminski.produtos.domain.Produto;
import com.kaminski.produtos.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto){
        var response = produtoService.cadastrar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> consultar(){
        var response = produtoService.consultarTodosProdutos();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}