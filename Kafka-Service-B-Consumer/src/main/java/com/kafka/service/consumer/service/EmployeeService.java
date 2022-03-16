package com.kafka.service.consumer.service;

import com.google.gson.Gson;
import com.kafka.service.consumer.model.Employee;
import com.kafka.service.consumer.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {
    @Autowired
    EmployeeRepo  employeeRepo;

    @Autowired
    Gson gson;


//    @KafkaListener(topics = "employee_personal_details", groupId = "employee_details_consumer_group")
//    public void pullRecord(String message) {
//        log.debug("pull record ----->     "+message);
//        this.saveRecordInMySQL(message);
//
//    }
    public void saveRecordInMySQL(Employee emp){
        Employee singleRecord= employeeRepo.save(emp);
        log.debug("saved record in mysql ----> "+singleRecord);

    }
//    public void saveRecordInMySQL(String message){
//        Employee singleRecord= employeeRepo.save(gson.fromJson(message,Employee.class));
//        log.warn("saved record in mysql ----> "+singleRecord);
//
//    }
}
