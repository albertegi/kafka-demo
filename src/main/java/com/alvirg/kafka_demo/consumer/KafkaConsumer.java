package com.alvirg.kafka_demo.consumer;

import com.alvirg.kafka_demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "albert", groupId = "myGroup")
//    public void consumeMsg(String msg){
//        log.info("Consuming the message from albert Topic:: {} ", msg);
//
//    }
    @KafkaListener(topics = "albert", groupId = "myGroup")
    public void consumeMsg(Student student){
        log.info("Consuming the message from albert Topic:: {} ", student.toString());

    }
}
