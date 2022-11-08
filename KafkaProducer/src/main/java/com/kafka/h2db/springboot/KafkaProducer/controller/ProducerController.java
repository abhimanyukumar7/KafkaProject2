package com.kafka.h2db.springboot.KafkaProducer.controller;

import com.kafka.h2db.springboot.KafkaProducer.producer.TopicsProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
@RequiredArgsConstructor
public class ProducerController {
    @Autowired
    private TopicsProducer topicsProducer;

    @GetMapping("/send")
    public void send(){
        topicsProducer.send("Some Message...");
    }
}
