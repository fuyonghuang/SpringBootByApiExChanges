package com.sic.utils.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseBodyHelper {
    public static Map success(Map resultMap) {
        Map<String, Object> response = new HashMap<>();

        response.put("errorCode", "0");
        response.put("result", resultMap);

        return response;
    }

    public static Map success(Map<String, Object> resultMap, int total) {
        Map<String, Object> response = new HashMap<>();

        response.put("errorCode", "0");
        response.put("result", resultMap);
        resultMap.put("total", total);

        return response;
    }

    public static Map fail(String errorCode, String errorMsg) {
        Map<String, Object> response = new HashMap<>();
        Map<String, String> result = new HashMap<>();

        result.put("errorMsg", errorMsg);
        response.put("errorCode", errorCode);
        response.put("result", result);

        return response;
    }
}
