package com.sic.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sic.utils.configuration.ServiceProperties;
import com.sic.utils.exception.NullResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/**
 * 请求demo
 * Created by fuyong_huang on 2017/6/8.
 */
@Component
@Configuration
public class HttpServiceDemo {
    private ServiceProperties serviceProperties;
    private HttpService httpService;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    HttpServiceDemo(ServiceProperties serviceProperties,
                    HttpService httpService) {
        this.serviceProperties = serviceProperties;
        this.httpService = httpService;
    }

    public  void  getHttpTest(){
        ServiceProperties.ApiProperty getAttachmentSerivce = serviceProperties.getApi("gettest");

        MultiValueMap<String, String> urlParams = new LinkedMultiValueMap<>();
        //配置参数
        //urlParams.add("referenceId", autoId);
        MultiValueMap<String, String> headerMap = new LinkedMultiValueMap<>();
        //配置header参数
       // headerMap.add("COOKIE", "SYNALESSO=" + userService.getToken(request));

        HttpEntity<Map> httpEntity = new HttpEntity<>(headerMap);
        String responseBody;
        try {
            //取回请求的结果
            responseBody = httpService.request(getAttachmentSerivce, httpEntity, urlParams);
            System.out.print( responseBody );
        } catch (NullResultException e) {
           System.out.print( e.toString() );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
