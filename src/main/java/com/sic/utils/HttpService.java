package com.sic.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.sic.utils.configuration.ServiceProperties;
import com.sic.utils.exception.CustomException;
import com.sic.utils.exception.NullResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpServerErrorException;

import java.io.IOException;

@Component
public class HttpService {
    private ServiceProperties serviceProperties;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public HttpService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String request(ServiceProperties.ApiProperty apiProperty, HttpEntity httpEntity, MultiValueMap urlParams) throws IOException, NullResultException, CustomException {
        try {
            String responseBody;
            if (urlParams != null) {
                responseBody = serviceProperties.getResponseBody(apiProperty, httpEntity, String.class, urlParams);
            } else {
                responseBody = serviceProperties.getResponseBody(apiProperty, httpEntity, String.class);
            }
            return responseBody;
        } catch (HttpServerErrorException e) {
            String responseBody = e.getResponseBodyAsString();
            String errorCode = objectMapper.readTree(responseBody).get("errorCode").textValue();
            if (errorCode == null || !errorCode.equals("500001")) {
                throw new CustomException("调用其他服务出错", "500000");
            } else {
                throw new NullResultException();
            }
        }
    }
}
