package com.suusarent.suusarentback.presistence.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Integer> {


    @Query("select (count(c) > 0) from Category c where c.name = :name")
    boolean existsByName(@Param("name") String name);
}