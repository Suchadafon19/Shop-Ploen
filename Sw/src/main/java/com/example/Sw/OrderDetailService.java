package com.example.Sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    
    public OrderDetail insertOrderDetail(OrderDetail orderDetail){
        System.out.println("-----------------------------------");
        System.out.println("orderdetail product no : "+orderDetail.getProductNo());
        System.out.println("-----------------------------------");
        return orderDetailRepository.save(orderDetail);
    }
}
