package com.example.Sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderListService {
    @Autowired
    private OrderListRepository orderListRepository;
  
    public OrderList insertOrderList(OrderList orderList){
        return orderListRepository.save(orderList);
    }
}
