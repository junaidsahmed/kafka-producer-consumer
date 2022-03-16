# Microservice kafka Producer Consumer 

# kafka-producer-consumer
There are two microservices service A and service B following are the serivces details:

service A: a producer service that reads the records from csv file and dproduces the dummy employee records on kafka topic.
```
producer:
    
    public boolean publishRecord(){
        List<Employee> lst=employeeDetails.readEmployeeRecordsFromFile();
        if(!lst.isEmpty()){
            lst.stream().forEach(singleRecord-> kafkaTemplate.send(employeeRecordsTopic,singleRecord));
            return true;
        }
        log.warn("Current File is empty");
        return false;
    }
    
```
service B: comsume the records from kafka topic and saves records in  mysql db.

```
consumer:

     @KafkaListener(topics = "employee_personal_details",
            groupId = "employee_details_consumer_group",containerFactory = "kafkaListenerContainerFactory")
    public void pullRecord(Employee employee) {
        log.debug("pull record ----->     "+ employee.toString());
        employeeService.saveRecordInMySQL(employee);

    }

```

both services is being containerized and have its own dockerfile build file. You can use the docker-compose.yml file to run and stop sevices over the docker.