package com.example.mailnotification.service.message;

import com.example.mailnotification.model.PaymentDTO;

public interface ConsumerService {
    void consumeMessage(PaymentDTO paymentDTO);
}
