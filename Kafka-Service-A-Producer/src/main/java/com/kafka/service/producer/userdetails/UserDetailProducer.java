package com.kafka.service.producer.userdetails;



import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class UserDetailProducer {

    public static void main(String[] args) {

        Properties properties= new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
        KafkaProducer<String,String> producer = new KafkaProducer<>(properties);
        int count =0;
        for (int i=0;i<1000000;i++){

            ProducerRecord<String,String> record= new ProducerRecord<>("test2","hello world "+count);
            ProducerRecord<String,String> record2= new ProducerRecord<>("test3","hello world "+count);
            ProducerRecord<String,String> record3= new ProducerRecord<>("test4","hello world "+count);
            producer.send(record);
            producer.send(record2);
            producer.send(record3);
            count++;
        }
       // ProducerRecord<String,String> record= new ProducerRecord<>("test2","hello world 2");

        producer.flush();
        producer.close();







    }
}
