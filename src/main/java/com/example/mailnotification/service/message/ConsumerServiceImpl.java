package com.example.mailnotification.service.message;

import com.example.mailnotification.model.PaymentDTO;
import com.example.mailnotification.service.mail.SendInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    SendInterface sendInterface;

    @Override
    @KafkaListener(id = "${spring.kafka.consumer.group-id}", topics = "${spring.kafka.topic.in}",
            containerFactory = "singleFactory")
    public void consumeMessage(PaymentDTO paymentDTO) {
        log.info("Message: {} successfully consumer", paymentDTO);


    }
}
