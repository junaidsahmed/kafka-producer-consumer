package com.kafka.service.consumer.repo;

import com.kafka.service.consumer.model.EmployeeMongo;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo <EmployeeMongo,Integer> {
}
