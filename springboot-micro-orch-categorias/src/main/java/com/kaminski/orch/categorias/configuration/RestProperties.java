package com.kaminski.orch.categorias.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(value = "spring.backend")
public class RestProperties {

    private String urlMicroProdutos;
    private String urlMicroCategorias;

}