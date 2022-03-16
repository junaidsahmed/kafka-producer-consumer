package com.kafka.service.consumer.listener;

import com.kafka.service.consumer.model.Employee;
import com.kafka.service.consumer.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmployeeRecordsListener {
    private EmployeeService employeeService;

    EmployeeRecordsListener (EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    /* this method will pull employee's record from kafka and save in to employee table
    */
    @KafkaListener(topics = "employee_personal_details",
            groupId = "employee_details_consumer_group",containerFactory = "kafkaListenerContainerFactory")
    public <T> void pullRecord(Class<T> theClass) {
        Employee emp = null;
        if(theClass.isInstance(Employee.class)){

        }
        log.debug("pull record ----->     "+ emp.toString());
        employeeService.saveRecordInMySQL(emp);

    }
}
