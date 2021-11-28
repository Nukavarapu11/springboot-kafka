package com.demo.springbootkafka.service;

import com.demo.springbootkafka.configuration.KafkaProducerConfig;
import com.demo.springbootkafka.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(UserData message) {
        kafkaTemplate.send("test", message.toString());
    }

}
