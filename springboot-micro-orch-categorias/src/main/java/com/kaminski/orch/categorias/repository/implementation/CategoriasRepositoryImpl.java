package com.kaminski.orch.categorias.repository.implementation;

import com.kaminski.orch.categorias.configuration.RestProperties;
import com.kaminski.orch.categorias.domain.Categoria;
import com.kaminski.orch.categorias.exception.ResourceNotFound;
import com.kaminski.orch.categorias.repository.CategoriasRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

@Repository
@AllArgsConstructor
public class CategoriasRepositoryImpl implements CategoriasRepository {

    private final RestTemplate restTemplate;
    private final RestProperties restProperties;

    @Override
    public Categoria findById(Long codigo) {

        try {

            var url = restProperties.getUrlMicroCategorias() + "/" + codigo;

            var response = restTemplate.exchange(
                    url, GET, null, Categoria.class);

            return response.getBody();

        }catch(RestClientException exception){

            var mensagem = String
                    .format("Recurso não encontrado. Codigo: %s, Tipo: %s", codigo, Categoria.class.getSimpleName());

            throw new ResourceNotFound(mensagem);
        }

    }

}