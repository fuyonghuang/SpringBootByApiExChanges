package com.sic.utils.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "service")
public class ServiceProperties implements ExchangeOperations {
    private List<ApiProperty> apis;
    private static final RestTemplate restTemplate = new RestTemplate();

    public ApiProperty getApi(String id) {
        ApiProperty api = null;

        for (ApiProperty apiProperty : this.apis) {
            if (apiProperty.getId().equals(id)) {
                api = apiProperty;
            }
        }

        return api;
    }

    private URI getUri(ApiProperty apiProperty) {
        return UriComponentsBuilder.fromHttpUrl(apiProperty.getUrl()).build().toUri();
    }

    private URI getUri(ApiProperty apiProperty, MultiValueMap<String, String> uriVariables) {
        return UriComponentsBuilder.fromHttpUrl(apiProperty.getUrl()).queryParams(uriVariables).build().toUri();
    }

    public <T> T getResponseBody(ApiProperty apiProperty, HttpEntity<?> requestEntity, Class<T> responseType, MultiValueMap<String, String> uriVariables) {
        return restTemplate.exchange(getUri(apiProperty, uriVariables), HttpMethod.valueOf(apiProperty.getMethod()), requestEntity, responseType).getBody();
    }

    public <T> T getResponseBody(ApiProperty apiProperty, HttpEntity<?> requestEntity, Class<T> responseType) {
        return restTemplate.exchange(getUri(apiProperty), HttpMethod.valueOf(apiProperty.getMethod()), requestEntity, responseType).getBody();
    }

    @Data
    public static class ApiProperty {
        private String id;
        private String url;
        private String method;
    }
}
