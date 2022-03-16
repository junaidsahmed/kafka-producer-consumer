package com.kafka.service.consumer.service;

import com.google.gson.Gson;
import com.kafka.service.consumer.model.EmployeeMongo;
import com.kafka.service.consumer.repo.MongoRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MongoService {



//    @Autowired
//    MongoRepo mongoRepo;

    public void  saveRecordInMongo(String message){
    //    EmployeeMongo singleRecordMongo = mongoRepo.save(gson.fromJson(message,EmployeeMongo.class));
       /// log.warn("Saved record in mongo "+singleRecordMongo);
    }
}
