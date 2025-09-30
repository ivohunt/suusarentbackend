package com.suusarent.suusarentback.persistence.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEditRepository extends JpaRepository<Order, Integer> {
}