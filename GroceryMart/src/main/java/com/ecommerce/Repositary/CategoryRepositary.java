package com.ecommerce.Repositary;

import com.ecommerce.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositary extends JpaRepository<Category,Integer> {
        public Boolean existsByCategory(String name);
}
