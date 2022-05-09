package com.example.mailnotification.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyModel {
    private String billId;
    private String clientId;
    private String paymentType;
    private Double amountOfDebt;
    private Date dueDate;}
