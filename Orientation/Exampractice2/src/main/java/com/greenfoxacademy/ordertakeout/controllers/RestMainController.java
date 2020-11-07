package com.greenfoxacademy.ordertakeout.controllers;

import com.greenfoxacademy.ordertakeout.models.OrderTakeoutStatusOnlyDTO;
import com.greenfoxacademy.ordertakeout.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestMainController {
    final
    OrderService orderService;

    public RestMainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/api/orders")
    public Object getAllBasedOnTypeAndProgress(@RequestParam(name = "type") String type, @RequestParam(name = "status") String status) {
        if (type != null && status != null && orderService.isTypeAndStatusValid(type, status)) {
            return orderService.getAllBasedOnTypeAndStatus(status, type);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PatchMapping(path = "/api/orders/{orderId}")
    public Object modifyStatusBasedOnId(@PathVariable int orderId, @RequestBody OrderTakeoutStatusOnlyDTO orderTakeoutStatusOnlyDTO) {
       if (orderService.findById(orderId) != null && orderService.isStatusValid(orderTakeoutStatusOnlyDTO.getStatus())) {
           orderService.findById(orderId).setStatus(orderTakeoutStatusOnlyDTO.getStatus());
           orderService.save(orderService.findById(orderId));
           return new ResponseEntity(HttpStatus.OK);
       } else {
           return new ResponseEntity(HttpStatus.BAD_REQUEST);
       }
    }
}
