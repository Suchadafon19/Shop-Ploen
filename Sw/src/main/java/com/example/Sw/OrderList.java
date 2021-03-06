package com.example.Sw;

import java.util.Date;

// import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderList")
public class OrderList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderNo")
    private Long orderNo;
    @Column(name = "totalPrice")
    private double totalPrice;
    @Column(name = "date")
    private Date date;
    @Column(name = "userNo")
    private Long userNo;
    @Column(name = "paymentNo")
    private Long paymentNo;

    public OrderList() {
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public Long getPaymentNo(){
        return paymentNo; 
    }

    public void setPaymentNo(Long paymentNo){
        this.paymentNo = paymentNo;
    }
}
