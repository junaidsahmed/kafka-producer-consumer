package com.kafka.service.consumer.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_name")
    private String phoneName;

    @Column(name ="hire_date")
    private String hireDate;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "manager_id")
    private String managerId;

    @Column(name = "department_id")
    private Integer departmentId;





}
