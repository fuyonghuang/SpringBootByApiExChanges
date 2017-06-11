package com.sic.utils.configuration;

import org.springframework.http.HttpEntity;
import org.springframework.util.MultiValueMap;

public interface ExchangeOperations {
    /**
     * 取请求返回Body
     *
     * @param apiProperty   自定义 api 配置
     * @param requestEntity 请求体，包含 header 和 body
     * @param responseType  返回体类型
     * @param uriVariables  url参数
     * @param <T>           body
     * @return body
     */
    <T> T getResponseBody(ServiceProperties.ApiProperty apiProperty, HttpEntity<?> requestEntity, Class<T> responseType, MultiValueMap<String, String> uriVariables);

    /**
     * 取请求返回Body
     *
     * @param apiProperty   自定义 api 配置
     * @param requestEntity 请求体，包含 header 和 body
     * @param responseType  返回体类型
     * @param <T>           body
     * @return body
     */
    <T> T getResponseBody(ServiceProperties.ApiProperty apiProperty, HttpEntity<?> requestEntity, Class<T> responseType);
}
