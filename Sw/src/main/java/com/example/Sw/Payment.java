package com.example.Sw;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentNo")
    private Long paymentNo;
    @Column(name = "ownerCardName")
    private String ownerCardName;
    @Column(name = "creditCardNo")
    private String creditCardNo;
    @Column(name = "paymentPrice")
    private double paymentPrice;
    @Column(name = "expireDate")
    private String expireDate;
    @Column(name = "CCV")
    private String CCV;

    public Payment() {
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public Long getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(Long paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getOwnerCardName() {
        return ownerCardName;
    }

    public void setOwnerCardName(String ownerCardName) {
        this.ownerCardName = ownerCardName;
    }

    public double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCCV() {
        return CCV;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }
}