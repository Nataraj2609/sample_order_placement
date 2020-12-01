package com.getcrookd.orderPlacement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderDetails getOrderById(int id) {
        return orderRepository.findById(id).get();
    }

    public void saveOrUpdate(OrderDetails order) {
        orderRepository.save(order);
    }

    public void deleteOrderById(int id) {
        orderRepository.deleteById(id);
    }

    public List<OrderDetails> getAllOrders() {
        ArrayList<OrderDetails> orderList = new ArrayList<>();
        orderRepository.findAll().forEach(e -> orderList.add(e));
        return orderList;
    }
}
