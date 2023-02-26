package com.kaminski.orch.categorias.service;

import com.kaminski.orch.categorias.camel.router.OrchRouter;
import com.kaminski.orch.categorias.model.response.CategoriaDTO;
import lombok.RequiredArgsConstructor;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoriasService {

    private final ProducerTemplate producerTemplate;

    public CategoriaDTO consultarCategoriaPorCodigo(Long codigo) {
        return producerTemplate.requestBody(OrchRouter.CATEGORIA, codigo, CategoriaDTO.class);
    }
}