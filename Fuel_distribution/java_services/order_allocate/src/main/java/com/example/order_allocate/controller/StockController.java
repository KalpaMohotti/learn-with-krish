package com.example.order_allocate.controller;



import com.example.order_allocate.model.Stock;
import com.example.order_allocate.service.AllocatedStockService;
import com.example.order_allocate.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController

public class StockController {



@Autowired
StockService stockService;
@Autowired
AllocatedStockService allocatedStockService;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public double placeOrder(){
        System.out.println("call rest api");
      //   producer.publishToTopic(new Event("order", "Place_new_order","key","1000","orderid","Pending"));
//        Stock s=new Stock();
//        s.setStockId(01);
//        s.setAvalableStock("50000");
//        s.setType("Petrol");
       return allocatedStockService.allocatedOrders();
      //  return "Order placed";
    }





}
