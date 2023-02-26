package com.kaminski.orch.categorias.camel.router;

import com.kaminski.orch.categorias.camel.processor.ProdutoProcessor;
import com.kaminski.orch.categorias.camel.processor.CategoriaProcessor;
import com.kaminski.orch.categorias.repository.CategoriasRepository;
import com.kaminski.orch.categorias.repository.ProdutosRepository;
import lombok.RequiredArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrchRouter extends RouteBuilder {

    public static final String PRODUTO = "direct:produto";
    public static final String CATEGORIA = "direct:categoria";
    public static final String BODY = "${body}";

    private final ProdutosRepository produtosRepository;
    private final CategoriasRepository categoriasRepository;

    @Override
    public void configure() {

        from(CATEGORIA)
                .log("ROUTER -> Micro Categorias")
                .bean(categoriasRepository, "findById")
                .process(new CategoriaProcessor())
                .to(PRODUTO)
                .end();

        from(PRODUTO)
                .log("ROUTER -> Micro Produtos")
                .bean(produtosRepository, "findProdutos")
                .process(new ProdutoProcessor())
                .end();

    }

}