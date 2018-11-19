package com.example.Sw;

import java.util.Date;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class OrderListController {
    @Autowired
    private OrderListService orderListService;

    @PostMapping("/insertOrderList")
    public ResponseEntity<OrderList> insertOrderList(@RequestBody HashMap<String,String> orderListHashMap){ 
        OrderList orderList = new OrderList();
        Date today = new Date();
        orderList.setDate(today);
        System.out.println(today);
        double totalPrice = Double.parseDouble(orderListHashMap.get("totalPrice")+"");
        orderList.setTotalPrice(totalPrice);
        System.out.println(totalPrice);
        Long userNo = Long.parseLong(orderListHashMap.get("userNo")+"");
        orderList.setUserNo(userNo);
        System.out.println(userNo);
        return new ResponseEntity<> (orderListService.insertOrderList(orderList),HttpStatus.OK);
    }
    
}
