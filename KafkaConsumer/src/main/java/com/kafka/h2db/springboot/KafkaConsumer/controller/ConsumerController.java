package com.kafka.h2db.springboot.KafkaConsumer.controller;

import com.kafka.h2db.springboot.KafkaConsumer.consumer.TopicConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private TopicConsumer topicConsumer;

    @GetMapping("get")
    public String consume(){
        return topicConsumer.getPayloadValue();
    }

}
