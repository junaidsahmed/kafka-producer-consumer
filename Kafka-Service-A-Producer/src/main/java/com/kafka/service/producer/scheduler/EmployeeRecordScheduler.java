package com.kafka.service.producer.scheduler;


import com.kafka.service.producer.service.EmployeeRecordPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmployeeRecordScheduler {

    private EmployeeRecordPublisher employeeRecordPublisher;
    private static Integer counter=0;

    EmployeeRecordScheduler(EmployeeRecordPublisher employeeRecordPublisher){
        this.employeeRecordPublisher =employeeRecordPublisher;
    }
    /*
        scheduler function that will publish employee records after the specific time
     */
    @Scheduled(initialDelay = 1000,fixedDelay = 4000)
    public void produceEmployeeRecords(){
        if(employeeRecordPublisher.publishRecord())
        {counter++;
            log.info("Employee record published and batch number is "+counter);}
    }
}
