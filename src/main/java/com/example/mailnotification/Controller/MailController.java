package com.example.mailnotification.Controller;

import com.example.mailnotification.model.PaymentDTO;
import com.example.mailnotification.service.mail.SendInterface;
import com.example.mailnotification.service.message.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    SendInterface sendInterface;
    @Autowired
    ConsumerService consumerService;

    public void sendEmail(PaymentDTO paymentDTO) {
        consumerService.consumeMessage(paymentDTO);
        sendInterface.sendEmail(paymentDTO.getClientModel().getClientEmail(),
                "Successfully paid",
                paymentDTO.getPaymentType() +
                        paymentDTO.getRemainderOfDebt()+paymentDTO.getCompanyModel().getDueDate());
    }
}
