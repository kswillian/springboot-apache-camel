package com.kaminski.orch.categorias.controller;

import com.kaminski.orch.categorias.model.response.CategoriaDTO;
import com.kaminski.orch.categorias.service.CategoriasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoriasControllerImpl implements CategoriasController {

    private final CategoriasService service;

    @Override
    public ResponseEntity<CategoriaDTO> findCategoriaProdutos(Long codigo) {
        var response = service.consultarCategoriaPorCodigo(codigo);
        return ResponseEntity.ok(response);
    }
}