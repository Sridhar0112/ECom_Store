package com.ecommerce.ServiceImplements;

import com.ecommerce.Model.Category;
import com.ecommerce.Repositary.CategoryRepositary;
import com.ecommerce.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepositary categoryRepositary;
    @Override
    public Category SaveCategory(Category category) {
        return categoryRepositary.save(category);
    }

    @Override
    public List<Category> ViewAllCategory(Category category) {
        List<Category>categoryList=categoryRepositary.findAll();
            return categoryList;
    }

    @Override
    public Boolean isExistsCategory(String name) {
        return categoryRepositary.existsByCategory(name);
    }

}
