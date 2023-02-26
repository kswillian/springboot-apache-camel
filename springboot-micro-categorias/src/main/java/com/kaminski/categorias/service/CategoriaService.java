package com.kaminski.categorias.service;

import com.kaminski.categorias.domain.Categoria;
import com.kaminski.categorias.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public Categoria cadastrar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> consultarTodasCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria consultarCategoriaPorCodigo(Long codigo){
        return categoriaRepository.findCategoriaByCodigo(codigo).get();
    }

}