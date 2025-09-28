package com.suusarent.suusarentback.persistence.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("select o from Order o where o.user.id = :id")
    List<Order> findByUserId(@Param("id") Integer id);
}