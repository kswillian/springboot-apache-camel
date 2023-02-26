package com.kaminski.orch.categorias.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDto {

    private Integer status;
    private String mensagem;

}
