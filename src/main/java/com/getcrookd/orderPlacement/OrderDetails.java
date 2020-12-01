package com.getcrookd.orderPlacement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDetails {

    public OrderDetails() {
    }

    @Id
    @GeneratedValue
    private int id;
    private int orderId;
    private String name;
    private String address;
    private int amount_Paid;

    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmount_Paid() {
        return amount_Paid;
    }

    public void setAmount_Paid(int amount_Paid) {
        this.amount_Paid = amount_Paid;
    }

}
