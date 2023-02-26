package com.kaminski.orch.categorias.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto implements Serializable {

    private Long codigo;
    private String nome;
    private Integer quantidadePorUnidade;
    private Double valorPorUnidade;
    private Boolean descontinuado;
    private Long codigoCategoria;

}