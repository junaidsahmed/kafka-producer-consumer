package com.kafka.service.producer.service;

import com.kafka.service.producer.dto.Employee;
import com.kafka.service.producer.utils.CSVFileUtility;
import com.opencsv.bean.CsvToBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
//name should be Service
public class EmployeeDetails {
    //private  final String filepath="/Users/jshakeel/Desktop/kafkaServices/Kafka-Service-A-Producer/src/main/resources/employee_records/employees.csv";
    private  final String filepath="/file/employees.csv";
    @Autowired
    private CSVFileUtility reader;
    public List<Employee> readEmployeeRecordsFromFile(){
        try {
            CsvToBean<Employee> dataBean= reader.readCSVFile( filepath,new Employee());
            return dataBean.stream().collect(Collectors.toList());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return new ArrayList<Employee>();

    }


}
