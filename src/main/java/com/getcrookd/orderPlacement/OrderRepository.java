package com.getcrookd.orderPlacement;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDetails, Integer> {
}
