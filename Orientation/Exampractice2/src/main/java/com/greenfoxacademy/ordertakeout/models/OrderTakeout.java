package com.greenfoxacademy.ordertakeout.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderTakeout {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @Column
    private String base;

    @Column
    private String topping;

    @Column
    private String status;

    @JsonIgnore
    @Column
    private String address;

    public OrderTakeout( String name, String base, String topping, String status, String address) {
        this.name = name;
        this.base = base;
        this.topping = topping;
        this.status = status;
        this.address = address;
    }

    public OrderTakeout() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
