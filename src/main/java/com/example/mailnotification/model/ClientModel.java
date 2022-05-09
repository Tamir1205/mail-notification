package com.example.mailnotification.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class ClientModel {

        private String clientId;

        private String clientName;

        private String clientLastName;


        private String clientEmail;
    }


