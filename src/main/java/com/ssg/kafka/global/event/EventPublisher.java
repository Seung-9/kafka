package com.ssg.kafka.global.event;

import com.ssg.kafka.standard.event.HaveEvenName;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventPublisher {
    private final KafkaTemplate<String, HaveEvenName> kafkaTemplate;

    public void publish(HaveEvenName event) {
        kafkaTemplate.send(event.getEventName(), event);
    }
}