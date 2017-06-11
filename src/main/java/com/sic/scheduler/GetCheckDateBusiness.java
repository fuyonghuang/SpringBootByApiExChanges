package com.sic.scheduler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sic.entity.*;
import com.sic.service.*;
import com.sic.utils.HttpService;
import com.sic.utils.configuration.ServiceProperties;
import com.sic.utils.exception.NullResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.util.List;

/**
 * Created by fuyong_huang on 2017/6/9.
 */
@Component
@Transactional
public class GetCheckDateBusiness {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Logger logger = LoggerFactory.getLogger( this.getClass() );
    private ServiceProperties serviceProperties;
    private HttpService httpService;
    private ChTaskService chTaskService;
    private ChTaskRecordService chTaskRecordService;
    private ChFormService chFormService;
    private ChItemService chItemService;
    private ChItemRecordService chItemRecordService;
    private ChItemRequirementService chItemRequirementService;
    private ChFormItemService chFormItemService;
    @Autowired
    GetCheckDateBusiness(ServiceProperties serviceProperties, HttpService httpService, ChTaskService chTaskService, ChTaskRecordService chTaskRecordService, ChFormService chFormService, ChItemService chItemService, ChItemRecordService chItemRecordService, ChItemRequirementService chItemRequirementService, ChFormItemService chFormItemService) {
        this.serviceProperties = serviceProperties;
        this.httpService = httpService;
        this.chTaskService = chTaskService;
        this.chTaskRecordService = chTaskRecordService;
        this.chFormService = chFormService;
        this.chItemService = chItemService;
        this.chItemRecordService = chItemRecordService;
        this.chItemRequirementService = chItemRequirementService;
        this.chFormItemService = chFormItemService;
    }


    public void getInsterCheckDate() {

        CheckDataModel bodyList = new CheckDataModel();
        ChTaskRecord chTaskRecord=new ChTaskRecord();
        chTaskRecord.setStatus(8L);
        chTaskRecord.setOfficeId("ea995118d14e4dbb883293f8f22185c2");
        List<ChTaskRecord> chTaskRecordList=chTaskRecordService.select(chTaskRecord);
  /*      List<ChTask> chTask=chTaskService.select(chTaskRecord);
        List<ChForm> chForm=chFormService.select(chTaskRecord);
        List<ChItemRecord> chItemRecord=chItemRecordService.select(chTaskRecord);
        List<ChFormItem> chFormItem=chFormItemService.select(chTaskRecord);
        List<ChItem> chItem=chItemService.select(chTaskRecord);
        List<ChItemRequirement> chItemRequirement=chItemRequirementService.select(chTaskRecord);*/


        for (ChTaskRecord chTaskRecordbean:chTaskRecordList){
            bodyList.setChTaskRecord( chTaskRecordbean );
            ChTask chTask=chTaskService.selectByPrimaryKey( chTaskRecordbean.getTaskId());
            bodyList.setChTask( chTask );
//            List<ChForm> chForm=chFormService.selectByPrimaryKey(chTaskRecordbean);
            List<ChItemRequirement> chItemRequirement=chItemRequirementService.select(chTaskRecordbean);
            bodyList.setChItemRequirementList( chItemRequirement );
            List<ChItemRecord> chItemRecord=chItemRecordService.select(chTaskRecordbean);
            bodyList.setChItemRecordList( chItemRecord );




        ServiceProperties.ApiProperty getApiSerivce = serviceProperties.getApi( "gettest" );
/*        MultiValueMap<String, String> urlParams = new LinkedMultiValueMap<>();
        //配置参数
        urlParams.add( "officeId", "ea995118d14e4dbb883293f8f22185c2" );
        urlParams.add( "status", "8" );*/
        MultiValueMap<String, String> headerMap = new LinkedMultiValueMap<>();
        //配置header参数
        // headerMap.add("COOKIE", "");

        HttpEntity httpEntity = new HttpEntity<>( bodyList,headerMap );
        String responseBody;
        try {
            responseBody = httpService.request( getApiSerivce, httpEntity, null );
         if(objectMapper.readTree( responseBody ).get( "errorCode" ).toString().equals( "0" )){
             ChTaskRecord bean=new ChTaskRecord();
             bean.setIsSync( "1" );
             bean.setId( chTaskRecordbean.getId() );
             chTaskRecordService.updateByPrimaryKey( bean );
         }else {
                logger.debug( "错了" );
         }
          /*  //获取字符串中的需要的对象
            String chTask = objectMapper.readTree( responseBody ).get( "chTask" ).toString();
            String chTaskRecord = objectMapper.readTree( responseBody ).get( "chTaskRecord" ).toString();
            String chForm = objectMapper.readTree( responseBody ).get( "chForm" ).toString();
            String chItemRecord = objectMapper.readTree( responseBody ).get( "chItemRecord" ).toString();
            String chFormItem = objectMapper.readTree( responseBody ).get( "chFormItem" ).toString();
            String chItem = objectMapper.readTree( responseBody ).get( "chItem" ).toString();
            String chItemRequirement = objectMapper.readTree( responseBody ).get( "chItemRequirement" ).toString();
            //反序列化
            List<ChTask> chTaskList = objectMapper.readValue( chTask,
                    objectMapper.getTypeFactory().constructCollectionType( List.class, ChTask.class ) );
            List<ChTaskRecord> chTaskRecordList = objectMapper.readValue( chTaskRecord,
                    objectMapper.getTypeFactory().constructCollectionType( List.class, ChTaskRecord.class ) );
            List<ChForm> chFormList = objectMapper.readValue( chForm,
                    objectMapper.getTypeFactory().constructCollectionType( List.class, ChForm.class ) );
            List<ChItemRecord> chItemRecordList = objectMapper.readValue( chItemRecord,
                    objectMapper.getTypeFactory().constructCollectionType( List.class, ChItemRecord.class ) );
            List<ChFormItem> chFormItemList = objectMapper.readValue( chFormItem,
                    objectMapper.getTypeFactory().constructCollectionType( List.class, ChFormItem.class ) );
            List<ChItem> chItemList = objectMapper.readValue( chItem,
                    objectMapper.getTypeFactory().constructCollectionType( List.class, ChItem.class ) );
            List<ChItemRequirement> chItemRequirementList = objectMapper.readValue( chItemRequirement,
                    objectMapper.getTypeFactory().constructCollectionType( List.class, ChItemRequirement.class ) );
                chTaskService.insert( chTaskList );
                //如果chTaskRecord 的记录已经存在不insert
               int i= chTaskRecordService.insert(chTaskRecordList);
               if(i!=0){
                chFormService.insert( chFormList );
                chItemService.insert(chItemList);
                chItemRequirementService.insert(chItemRequirementList);
                chFormItemService.insert(chFormItemList);
                chItemRecordService.insert( chItemRecordList );
            }*/



        } catch (NullResultException e) {
            logger.debug( e.toString() );
        } catch (IOException e) {
            logger.debug( e.toString() );
        }

        }
    }

}
