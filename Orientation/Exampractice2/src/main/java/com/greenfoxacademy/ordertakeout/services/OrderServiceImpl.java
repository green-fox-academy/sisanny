package com.greenfoxacademy.ordertakeout.services;

import com.greenfoxacademy.ordertakeout.models.OrderTakeout;
import com.greenfoxacademy.ordertakeout.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    final
    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderTakeout findById(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public void save(OrderTakeout order) {
        orderRepository.save(order);
    }

    @Override
    public boolean isStatusCorrect(String status, OrderTakeout orderTakeout) {
        return orderTakeout.getStatus().equals(status);
    }

    @Override
    public String getType(String topping) {
        if(topping == null) {
            return "null";
        } else if (topping.equals("smoked tofu")){
            return "vegetarian";
        } else if (topping.equals("chicken") || topping.equals("beef")){
            return "all";
        } else {
            return "invalid";
        }
    }

    @Override
    public List<OrderTakeout> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<OrderTakeout> getAllBasedOnTypeAndStatus( String status, String type) {
        List<OrderTakeout> filteredList = new ArrayList<>();
        for (int i = 0; i < orderRepository.findAll().size(); i++) {
            if (isStatusCorrect(status, orderRepository.findAll().get(i)) && getType(orderRepository.findAll().get(i).getTopping()).equals(type)) {
                filteredList.add(orderRepository.findAll().get(i));
            }
        }
        return filteredList;
    }

    @Override
    public boolean isTypeAndStatusValid(String type, String status) {
        int counter = 0;
        String[] listOfTypes = {"vegetarian", "all"};
        String[] listOfStatus = {"ordered", "inprogress", "done"};
        for (String listOfType : listOfTypes) {
            if (type.equals(listOfType)) {
                counter = counter + 1;
            }
        }
        for (String ofStatus : listOfStatus) {
            if (status.equals(ofStatus)) {
                counter = counter + 1;
            }
        }
        return counter > 1;
    }

    @Override
    public boolean isStatusValid(String status) {
        int counter = 0;
        String[] listOfStatus = {"ordered", "inprogress", "done"};
        for (String ofStatus : listOfStatus) {
            if (status.equals(ofStatus)) {
                counter = counter + 1;
            }
        }
        return counter > 0;
    }
}
