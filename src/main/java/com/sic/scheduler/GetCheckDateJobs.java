package com.sic.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by fuyong_huang on 2017/6/8.
 */
@Component
public class GetCheckDateJobs  {
    private GetCheckDateBusiness getCheckDateBusinesset;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    GetCheckDateJobs(GetCheckDateBusiness getCheckDateBusinesset
                              ) {
        this.getCheckDateBusinesset = getCheckDateBusinesset;
    }
    @Scheduled(cron="0 0/1 * * * ?")
    public void   getChTaskRecordDateJobs(){
        logger.info( "跑起来吧皮卡丘" );
        getCheckDateBusinesset.getInsterCheckDate();
    }
}
