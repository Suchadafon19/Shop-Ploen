package com.example.Sw;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",allowCredentials = "true")
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<Payment> insertPayment(@RequestBody HashMap<String,String> paymentHashMap){

        Payment payment = new Payment();
        System.out.println("credit card no: "+paymentHashMap.get("creditCardNo"));
        payment.setCreditCardNo(paymentHashMap.get("creditCardNo"));
        System.out.println("credit card no: "+paymentHashMap.get("creditCardNo"));
        payment.setOwnerCardName(paymentHashMap.get("ownerCardName"));
        System.out.println("credit card name: "+paymentHashMap.get("ownerCardName"));
        payment.setExpireDate(paymentHashMap.get("expireDate"));
        System.out.println("expire date : "+paymentHashMap.get("expireDate"));
        payment.setCCV(paymentHashMap.get("CCV"));
        System.out.println("expire date : "+paymentHashMap.get("CCV"));
        Double paymentPrice = Double.parseDouble(paymentHashMap.get("totalPrice"));
        payment.setPaymentPrice(paymentPrice);
        System.out.println("--------------------------");
        return new ResponseEntity<>(paymentService.insertPayment(payment),HttpStatus.OK);
    }
}

