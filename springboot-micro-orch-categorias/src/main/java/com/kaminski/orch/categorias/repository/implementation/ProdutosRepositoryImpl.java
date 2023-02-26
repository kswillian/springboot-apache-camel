package com.kaminski.orch.categorias.repository.implementation;

import com.kaminski.orch.categorias.configuration.RestProperties;
import com.kaminski.orch.categorias.domain.Produto;
import com.kaminski.orch.categorias.repository.ProdutosRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.http.HttpMethod.GET;

@Repository
@AllArgsConstructor
public class ProdutosRepositoryImpl implements ProdutosRepository {

    private final RestTemplate restTemplate;
    private final RestProperties restProperties;

    @Override
    public List<Produto> findProdutos() {

        try {

            var url = restProperties.getUrlMicroProdutos();

            var response = restTemplate.exchange(
                    url, GET, null, new ParameterizedTypeReference<List<Produto>>(){});

            return response.getBody();

        }catch(RestClientException exception){
            throw new RuntimeException(exception.getMessage());
        }

    }

}