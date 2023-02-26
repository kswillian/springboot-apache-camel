package com.kaminski.categorias.controller;

import com.kaminski.categorias.domain.Categoria;
import com.kaminski.categorias.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> cadastrar(@RequestBody Categoria categoria){
        var response = categoriaService.cadastrar(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> consultar(){
        var response = categoriaService.consultarTodasCategorias();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Categoria> consultarPorCodigo(@PathVariable Long codigo){
        var response = categoriaService.consultarCategoriaPorCodigo(codigo);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
