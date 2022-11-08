package com.kafka.h2db.springboot.KafkaProducer.modal;

import lombok.Data;

@Data
public class User {
    private String name;
    private String location;
    private int salary;
}
