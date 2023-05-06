package com.sicred.sicredsession.producer;

import com.sicred.sicredsession.dto.VotoResponse;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;

@Log4j
public class VotoProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    private RabbitTemplate rabbitTemplate;

    public VotoProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(VotoResponse votoResponse){
        log.info(String.format("Message sent -> %s", votoResponse));
        rabbitTemplate.convertAndSend(exchange, routingKey, votoResponse);
    }

}
