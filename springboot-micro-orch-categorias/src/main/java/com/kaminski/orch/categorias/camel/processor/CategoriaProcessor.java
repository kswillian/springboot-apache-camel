package com.kaminski.orch.categorias.camel.processor;

import com.kaminski.orch.categorias.domain.Categoria;
import com.kaminski.orch.categorias.model.response.CategoriaDTO;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CategoriaProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {
        var body = exchange.getIn().getBody(Categoria.class);
        exchange.setProperty("categoria", new CategoriaDTO(body));
        exchange.getIn().setBody(body);
    }

}