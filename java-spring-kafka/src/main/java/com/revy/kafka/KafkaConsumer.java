package com.revy.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

//    @KafkaListener(topics = KafkaConstant.TOPIC)
//    public void getMessage(
//            final @Payload String message,
//            final @Header(KafkaHeaders.OFFSET) Integer offset,
//            final @Header(KafkaHeaders.RECEIVED_KEY) String key,
//            final @Header(KafkaHeaders.PARTITION) int partition,
//            final @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
//            final @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long ts,
//            final Acknowledgment acknowledgment
//    ) {
//        log.info("message:{}, offset:{},", message, offset);
//        acknowledgment.acknowledge();
//    }

    @KafkaListener(topics = KafkaConstant.TOPIC)
    public void getMessage(
            final @Payload String message,
            final Acknowledgment acknowledgment
    ) {
        log.info("message:{}", message);
        acknowledgment.acknowledge();
    }
}
