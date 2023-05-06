package com.sicred.sicredsession.consumer;

import com.sicred.sicredsession.dto.VotoRequest;
import com.sicred.sicredsession.service.VotoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class VotoConsumer {

    @Autowired
    private VotoService votoService;

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void receiver(@Payload VotoRequest votoRequest) {
        votoService.create(votoRequest);
    }

}
