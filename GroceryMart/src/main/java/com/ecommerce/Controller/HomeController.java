package com.ecommerce.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/user")
public class HomeController {

    @GetMapping("/")
    public  String getResult(){
        return "index";
    }
    @GetMapping("/login")
    public  String login(){
        return "Login";
    }
    @GetMapping("/register")
    public  String register(){
        return "Register";
    }
    @GetMapping("/products")
    public  String products(){
        return "Product";
    }
    @GetMapping("/viewProduct")
    public String View_products(){
        return "view_product.html";
    }
}
