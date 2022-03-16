package com.kafka.service.producer.service;

import com.kafka.service.producer.dto.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeRecordPublisher {

    @Autowired
    EmployeeDetails employeeDetails;

    @Value("${kafka.topic}")
    public String employeeRecordsTopic;

    @Autowired
    KafkaTemplate kafkaTemplate;

    public boolean publishRecord(){
        List<Employee> lst=employeeDetails.readEmployeeRecordsFromFile();
        if(!lst.isEmpty()){
            lst.stream().forEach(singleRecord-> kafkaTemplate.send(employeeRecordsTopic,singleRecord));
            return true;
        }
        log.warn("Current File is empty");
        return false;
    }

    /* public void publishEmployeeRecord(){
        String topic="employeedetails";
        List<Employee> lst=employeeDetails.readEmployeeRecordsFromFile();
        if(!lst.isEmpty()){
        KafkaProducer<String,String> producer = new KafkaProducer<>(kafkaConfigProperties.getKafkaProducer());

           lst.stream().forEach(singleRecord->{
               ProducerRecord<String,String> record= new ProducerRecord<>(topic,gson.toJson(singleRecord));
               producer.send(record);
           });
           producer.close();
           return;
       }
       log.warn("Current File is empty");

    }
*/


}
