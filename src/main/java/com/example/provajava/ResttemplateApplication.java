package com.example.provajava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootApplication
public class ResttemplateApplication {

    @Test
    public void consumerApi() {
        RestTemplate template = new RestTemplate();

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api-test.bhut.com.br:3000")
                .path("/cars")
                .queryParam("api-docs")
                .build();


    }


}
