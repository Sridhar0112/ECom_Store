package com.ecommerce.Model;

import com.ecommerce.Service.CategoryService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/")
    public String index() {
        return "Admin/index";
    }

    @GetMapping("/loadAddProduct")
    public String Addproduct() {
        return "Admin/add_product";
    }

    @GetMapping("/category")
    public String Category() {
        return "Admin/category";
    }
    @PostMapping("/saveCategory")
    public String SaveCategory(@ModelAttribute Category category, HttpSession session){
        if(categoryService.isExistsCategory(category.getName())){
            session.setAttribute("errorMsg","Category Name already Exists");
        }
        else{
            Category SavedCategory=categoryService.SaveCategory(category);
            if(ObjectUtils.isEmpty(SavedCategory)){
                session.setAttribute("errorMsg","Not Saved! Internal Server Error");
            }
            else{
                session.setAttribute("succMsg","Saved Category Successfully");
            }
        }

        return "redirect:/category";
    }
}
