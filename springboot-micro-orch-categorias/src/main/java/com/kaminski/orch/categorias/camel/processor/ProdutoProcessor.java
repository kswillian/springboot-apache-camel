package com.kaminski.orch.categorias.camel.processor;

import com.kaminski.orch.categorias.domain.Produto;
import com.kaminski.orch.categorias.model.response.CategoriaDTO;
import com.kaminski.orch.categorias.model.response.ProdutoDTO;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        var body = exchange
                .getProperty("categoria", CategoriaDTO.class);

        var produtos = (List<Produto>) exchange.getIn().getBody(ArrayList.class);

        var produtosDaCategoria = produtos
                .stream()
                .filter(produto -> produto.getCodigoCategoria().longValue() == body.getCodigo().longValue())
                .map(ProdutoDTO::new)
                .collect(Collectors.toList());

        body.setProdutos(produtosDaCategoria);

        exchange.setProperty("produto", body);
        exchange.getIn().setBody(body);

    }

}