package com.greenfoxacademy.ordertakeout.controllers;

import com.greenfoxacademy.ordertakeout.models.OrderTakeout;
import com.greenfoxacademy.ordertakeout.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    final
    OrderService orderService;

    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/")
    public String renderMainPage(Model model) {
        model.addAttribute("orderForm", new OrderTakeout());
        return "index";
    }

    @PostMapping(path = "/order")
    public String postMainPage(@ModelAttribute OrderTakeout orderForm) {
        OrderTakeout orderTakeout = new OrderTakeout();
        orderTakeout.setAddress(orderForm.getAddress());
        orderTakeout.setBase(orderForm.getBase());
        orderTakeout.setName(orderForm.getName());
        orderTakeout.setTopping(orderForm.getTopping());
        orderTakeout.setStatus("ordered");
        orderService.save(orderTakeout);
        return "redirect:/order/" + orderTakeout.getId();
    }

    @GetMapping(path = "/order/{orderId}")
    public String renderOrderPageWithId(@PathVariable int orderId, Model model) {
        if(orderService.findById(orderId) == null){
            return "error";
        } else {
            model.addAttribute("order", orderService.findById(orderId));
            return "orderPage";
        }
    }
}
