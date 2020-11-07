package com.greenfoxacademy.ordertakeout.models;

public class OrderTakeoutStatusOnlyDTO {
    private String status;

    public OrderTakeoutStatusOnlyDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderTakeoutStatusOnlyDTO(String status) {
        this.status = status;
    }
}
