package com.ecommerce.Service;

import com.ecommerce.Model.Category;

import java.util.List;

public interface CategoryService {
    public Category SaveCategory(Category category);

    public List<Category> ViewAllCategory(Category category);

    public Boolean isExistsCategory(String name);
}
