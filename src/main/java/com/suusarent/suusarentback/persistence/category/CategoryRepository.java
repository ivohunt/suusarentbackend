package com.suusarent.suusarentback.persistence.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Integer> {


    @Query("select (count(c) > 0) from Category c where c.name = :categoryName")
    boolean categoryExistsBy(String categoryName);
}