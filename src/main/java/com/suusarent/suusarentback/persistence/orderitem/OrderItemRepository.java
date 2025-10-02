package com.suusarent.suusarentback.persistence.orderitem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    @Query("select o from OrderItem o where o.order.id = :orderId")
    List<OrderItem> findByOrderId (Integer orderId);


}