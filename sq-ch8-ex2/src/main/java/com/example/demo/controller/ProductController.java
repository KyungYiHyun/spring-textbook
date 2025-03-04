package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping(path = "/products",method = RequestMethod.POST)
    public String addProduct(
            @RequestParam String name,
            @RequestParam double price,
            Model model
    ){
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        productService.addProduct(p);

        List<Product> all = productService.findAll();
        model.addAttribute("products",all);
        return "products.html";
    }


    @RequestMapping("/products")
    public String viewProducts(Model model){
        List<Product> all = productService.findAll();
        model.addAttribute("products",all);
        return "products.html";
    }
}
