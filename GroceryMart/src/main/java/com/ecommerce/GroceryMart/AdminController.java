package com.ecommerce.GroceryMart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/")
    public  String index(){
        return "Admin/index";
    }
    @GetMapping("/loadAddProduct")
    public String Addproduct(){
        return "Admin/add_product";
    }
    @GetMapping("/category")
    public String Category(){
        return "Admin/category";
    }

}
