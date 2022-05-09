package com.example.mailnotification.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PaymentDTO {
    private String paymentId;
    private CompanyModel companyModel;
    private ClientModel clientModel;
    private String paymentType;
    private Double amountOfPayment;
    private Double remainderOfDebt;

}
