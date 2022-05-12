package com.example.mailnotification;

import com.example.mailnotification.model.PaymentDTO;
import com.example.mailnotification.service.message.ConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailNotificationApplication {
    @Autowired
    private EmailSenderService emailSenderService;
    @Autowired
    private ConsumerServiceImpl consumerService;

    public static void main(String[] args) {
        SpringApplication.run(MailNotificationApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        PaymentDTO paymentDTO=new PaymentDTO();

    }
}

