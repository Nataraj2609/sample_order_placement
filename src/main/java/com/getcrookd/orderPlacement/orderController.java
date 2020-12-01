package com.getcrookd.orderPlacement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class orderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders/{id}")
    private OrderDetails getOrder(@PathVariable(value = "id") int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/orders")
    private int saveOrder(@RequestBody OrderDetails orderDetails) {
        orderService.saveOrUpdate(orderDetails);
        return orderDetails.getId();
    }

    @DeleteMapping("/orders/{id}")
    private void deleteOrder(@PathVariable("id") int id) {
        orderService.deleteOrderById(id);
    }

    @GetMapping("/orders")
    private List<OrderDetails> getAllOrders(){
        return orderService.getAllOrders();
    }
}
