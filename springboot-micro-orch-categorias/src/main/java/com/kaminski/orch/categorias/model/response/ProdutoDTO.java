package com.kaminski.orch.categorias.model.response;

import com.kaminski.orch.categorias.domain.Produto;
import lombok.Data;

@Data
public class ProdutoDTO {

    private Long codigo;
    private String nome;

    private Long codigoCategoria;

    public ProdutoDTO(Produto produto){
        this.codigo = produto.getCodigo();
        this.nome = produto.getNome();
        this.codigoCategoria = produto.getCodigoCategoria();
    }

}