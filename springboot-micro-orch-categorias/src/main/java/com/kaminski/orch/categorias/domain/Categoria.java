package com.kaminski.orch.categorias.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria implements Serializable {

    private Long codigo;
    private String nome;
    private Date dataCricao;

}