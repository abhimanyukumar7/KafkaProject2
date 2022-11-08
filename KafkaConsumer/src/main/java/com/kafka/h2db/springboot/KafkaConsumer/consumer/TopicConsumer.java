package com.kafka.h2db.springboot.KafkaConsumer.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicConsumer {
    @Value("${topic.name.consumer}")
    private String topicName;

    private String payloadValue;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id_consumer")
    public String consume(ConsumerRecord<String, String> payload){
        log.info("Topic Name :- " + topicName);
        log.info("Key :- " + payload.key());
        log.info("Value :- " + payload.value());
        log.info("Headers :- " + payload.headers());
        log.info("Partition :- " + payload.partition());
        payloadValue = payload.value();
        return payload.value();
    }

    public String getPayloadValue() {
        return payloadValue;
    }
}
