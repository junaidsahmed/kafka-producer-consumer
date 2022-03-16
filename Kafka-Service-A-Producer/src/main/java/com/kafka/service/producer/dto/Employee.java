package com.kafka.service.producer.dto;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
public class Employee {

   // @CsvBindByName(column = "EMPLOYEE_ID")
    @CsvBindByPosition(position = 0)
    private  String employeeId;
   // @CsvBindByName(column = "FIRST_NAME")
   @CsvBindByPosition(position = 1)
    private String firstName;
    @CsvBindByPosition(position = 2)
   // @CsvBindByName(column = "LAST_NAME")
    private String lastName;
    @CsvBindByPosition(position = 3)
   // @CsvBindByName(column = "EMAIL")
    private String email;
    @CsvBindByPosition(position = 4)
   // @CsvBindByName(column = "PHONE_NUMBER")
    private String phoneName;
    @CsvBindByPosition(position = 5)
   // @CsvBindByName(column = "HIRE_DATE")
    private String hireDate;
    @CsvBindByPosition(position = 6)
   // @CsvBindByName(column = "JOB_ID")
    private String jobId;
    @CsvBindByPosition(position = 7)
   // @CsvBindByName(column = "SALARY")
    private Integer salary;
    @CsvBindByPosition(position = 9)
    //@CsvBindByName(column = "MANAGER_ID")
    private String managerId;
    @CsvBindByPosition(position = 10)
  //  @CsvBindByName(column = "DEPARTMENT_ID")
    private Integer departmentId;
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", jobId='" + String.valueOf(jobId) + '\'' +
                ", salary=" + String.valueOf(salary) +
                ", managerId=" +String.valueOf( managerId) +
                ", departmentId=" + String.valueOf(departmentId) +
                '}';
    }
}
