package com.kaminski.orch.categorias.controller;

import com.kaminski.orch.categorias.model.response.CategoriaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("v1/categorias")
public interface CategoriasController {

    @GetMapping("/{codigo}/produtos")
    ResponseEntity<CategoriaDTO> findCategoriaProdutos(@PathVariable Long codigo);

}