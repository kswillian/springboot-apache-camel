package com.kaminski.orch.categorias.model.response;

import com.kaminski.orch.categorias.domain.Categoria;
import lombok.Data;

import java.util.List;

@Data
public class CategoriaDTO {

    private Long codigo;
    private String nome;

    private List<ProdutoDTO> produtos;

    public CategoriaDTO(Categoria categoria) {
        this.codigo = categoria.getCodigo();
        this.nome = categoria.getNome();
    }
}