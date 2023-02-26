package com.kaminski.orch.categorias.repository;

import com.kaminski.orch.categorias.domain.Categoria;

public interface CategoriasRepository {

    Categoria findById(Long codigo);

}