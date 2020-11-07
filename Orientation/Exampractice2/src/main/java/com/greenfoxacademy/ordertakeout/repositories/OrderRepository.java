package com.greenfoxacademy.ordertakeout.repositories;

import com.greenfoxacademy.ordertakeout.models.OrderTakeout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<OrderTakeout, Integer> {
    OrderTakeout findById(int id);
    List<OrderTakeout> findAll();
}
