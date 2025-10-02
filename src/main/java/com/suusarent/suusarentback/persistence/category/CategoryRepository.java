package com.suusarent.suusarentback.persistence.category;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {


    @Query("select (count(c) > 0) from Category c where c.name = :categoryName")
    boolean categoryExistsBy(String categoryName);


    @EntityGraph(attributePaths = {"items", "items.equipmentSize"})
    @Query("""
                SELECT DISTINCT c
                FROM Category c
                WHERE EXISTS (
                    SELECT i
                    FROM Item i
                    WHERE i.category = c
                      AND i.isAvailable = true
                      AND i.id NOT IN (
                          SELECT oi.item.id
                          FROM OrderItem oi
                          JOIN oi.order o
                          WHERE NOT (o.end < :startDate OR o.start > :endDate)
                      )
                )
            """)
    List<Category> findAvailableCategoriesWithItems(@Param("startDate") LocalDate startDate,
                                                    @Param("endDate") LocalDate endDate);


}