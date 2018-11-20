package com.example.Sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService{
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment insertPayment(Payment payment){
        return paymentRepository.save(payment);
    } 
}

