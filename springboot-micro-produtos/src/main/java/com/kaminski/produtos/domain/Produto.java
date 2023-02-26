package com.kaminski.produtos.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;
    private String nome;
    private Integer quantidadePorUnidade;
    private Double valorPorUnidade;
    private Boolean descontinuado;
    private Long codigoCategoria;

}