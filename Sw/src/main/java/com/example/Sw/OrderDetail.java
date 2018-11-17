package com.example.Sw;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderDetailNo")
    private long orderDetailNo;
    @Column(name = "quanlity")
    private int quanlity;
    @Column(name = "price")
    private double price;
    @Column(name = "total")
    private double total;
    @Column(name = "productNo")
    private long productNo;

    public OrderDetail() {
    }

    public long getOrderDetailNo() {
        return orderDetailNo;
    }

    public void setOrderDetailNo(long orderDetailNo) {
        this.orderDetailNo = orderDetailNo;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getProductNo() {
        return productNo;
    }

    public void setProductNo(long productNo) {
        this.productNo = productNo;
    }  
}
