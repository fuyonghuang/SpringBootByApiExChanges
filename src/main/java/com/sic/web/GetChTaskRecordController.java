package com.sic.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sic.entity.*;
import com.sic.service.*;
import com.sic.utils.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fuyong_huang on 2017/6/8.
 */
@RestController
public class GetChTaskRecordController {
   /* private ServiceProperties serviceProperties;
    private HttpService httpService;*/
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ChTaskService chTaskService;
    private ChTaskRecordService chTaskRecordService;
    private ChFormService chFormService;
    private ChItemService chItemService;
    private ChItemRecordService chItemRecordService;
    private ChItemRequirementService chItemRequirementService;
    private ChFormItemService chFormItemService;
    @Autowired
    GetChTaskRecordController(ChTaskService chTaskService, ChTaskRecordService chTaskRecordService, ChFormService chFormService, ChItemService chItemService, ChItemRecordService chItemRecordService, ChItemRequirementService chItemRequirementService, ChFormItemService chFormItemService) {
        this.chTaskService = chTaskService;
        this.chTaskRecordService = chTaskRecordService;
        this.chFormService = chFormService;
        this.chItemService = chItemService;
        this.chItemRecordService = chItemRecordService;
        this.chItemRequirementService = chItemRequirementService;
        this.chFormItemService = chFormItemService;
    }

    /**
     * 区县下发任务接收端口
     * @param checkDataModel
     * @return
     */
    @PostMapping("insert")
    public Map insertCheck(@RequestBody CheckDataModel checkDataModel){
        Map<String, String> response = new HashMap<>();
        ChTaskRecord chTaskRecord = checkDataModel.getChTaskRecord();
        ChTask chTask = checkDataModel.getChTask();
        ChForm chForm = checkDataModel.getChForm();
        List<ChItem> chItemList = checkDataModel.getChItemList();
        List<ChFormItem> chFormItemList = checkDataModel.getChFormItemList();
        List<ChItemRequirement> chItemRequirementList = checkDataModel.getChItemRequirementList();
        List<ChItemRecord> chItemRecordList = checkDataModel.getChItemRecordList();
        int i = chTaskRecordService.insert( chTaskRecord );
        if(i!=0){
            chTaskService.insert( chTask );
            chFormService.insert( chForm );
            chItemService.insert( chItemList );
            chFormItemService.insert( chFormItemList );
            chItemRequirementService.insert( chItemRequirementList );
            chItemRecordService.insert( chItemRecordList );
            response.put( "errorCode","0");
        }else {
            throw  new CustomException( "同步失败" ,"-1");


        }
        return response;
    }

/*@GetMapping("/getrecord")
    public String  getChTaskRecordDate(){
        ServiceProperties.ApiProperty getAttachmentSerivce = serviceProperties.getApi("gettest");
        MultiValueMap<String, String> urlParams = new LinkedMultiValueMap<>();
        //配置参数
        urlParams.add("officeId", "ea995118d14e4dbb883293f8f22185c2");
        MultiValueMap<String, String> headerMap = new LinkedMultiValueMap<>();
        //配置header参数
        // headerMap.add("COOKIE", "SYNALESSO=" + userService.getToken(request));

        HttpEntity<Map> httpEntity = new HttpEntity<>(headerMap);
        try {
            return httpService.request(getAttachmentSerivce, httpEntity, urlParams);
        }catch (NullResultException e) {
            System.out.print( e.toString() );
        }catch (IOException e) {
            e.printStackTrace();
        }

    return "";
    }*/
}
