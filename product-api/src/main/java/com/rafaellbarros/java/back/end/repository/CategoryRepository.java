package com.rafaellbarros.java.back.end.repository;

import com.rafaellbarros.java.back.end.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
