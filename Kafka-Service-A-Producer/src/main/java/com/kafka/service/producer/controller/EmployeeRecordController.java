package com.kafka.service.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRecordController {
    //@Autowired
   // private EmployeeRecordPublisher employeeRecordPublisher;


    @GetMapping(value = "/readutil")
    public String runReadFileUtil(@RequestParam String topicname){
       // employeeRecordPublisher.publishEmployeeRecord(topicname);
        return "completed";
    }
}
