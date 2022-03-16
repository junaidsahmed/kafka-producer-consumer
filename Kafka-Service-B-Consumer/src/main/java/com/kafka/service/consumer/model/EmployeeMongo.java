package com.kafka.service.consumer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;


@Data
//@Document(value = "employee_details")
public class EmployeeMongo {

    @Id
    private Integer id;

    private Integer employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneName;

    private String hireDate;

    private String jobId;

    private Integer salary;


    private String managerId;


    private Integer departmentId;
}
