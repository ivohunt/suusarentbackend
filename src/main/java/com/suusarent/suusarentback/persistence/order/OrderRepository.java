package com.suusarent.suusarentback.persistence.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query("select o from Order o where o.user.id = :userId")
    List<Order> findOrdersBy(Integer userId);

    @Query("select o from Order o where o.user.id = :userId and o.status = :status")
    Optional<Order> findOrderBy(Integer userId, String status);

    @Query("select o from Order o where o.status = :status order by o.status, o.updatedAt DESC")
    List<Order> findOrdersBy(String status);

}

