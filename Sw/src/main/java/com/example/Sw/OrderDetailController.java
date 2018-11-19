package com.example.Sw;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",allowCredentials = "true")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    @PostMapping("/insertOrderD")
    public ResponseEntity<OrderDetail> insertOrderDetail(@RequestBody HashMap<String,String> orderDetail){
        System.out.println("Product no. : "+orderDetail.get("productNo"));
        System.out.println("Price : "+orderDetail.get("price"));
        System.out.println("Quantity : "+orderDetail.get("quanlity"));
        System.out.println("Total : "+orderDetail.get("total"));
        System.out.println("----");
        
        OrderDetail orderD = new OrderDetail();
        long productNo = Long.parseLong(orderDetail.get("productNo")+"");
        orderD.setProductNo(productNo);
        double price = Double.parseDouble(orderDetail.get("price")+"");
        orderD.setPrice(price);
        int quantity = Integer.parseInt(orderDetail.get("quanlity")+"");
        orderD.setQuantity(quantity);
        double total = Double.parseDouble(orderDetail.get("total")+"");
        orderD.setTotal(total);
        Long orderNo = Long.parseLong(orderDetail.get("orderNo"));
        orderD.setOrderNo(orderNo);
        return new ResponseEntity<> (orderDetailService.insertOrderDetail(orderD),HttpStatus.OK);
    }
    
}
