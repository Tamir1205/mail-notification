package com.example.mailnotification.service.mail;

import com.example.mailnotification.model.PaymentDTO;

public interface SendInterface {
    void sendEmail(String to, String subject, String message );
}
