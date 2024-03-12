package com.example.product.controller;

import com.example.product.dto.FakeStoreProductDto;
import com.example.product.dto.FakeStoreCategoryDto;
import com.example.product.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class ProductController {
    ProductService ps;

    ProductController (ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/products/")
    public FakeStoreProductDto[] getAllProducts(){
        return ps.getAllProducts();
    }

    @GetMapping("/products/{id}/")
    public FakeStoreProductDto getProductByID(@PathVariable Long id) {
     return ps.getProductbyId(id);
    }

//    @GetMapping("/products/category/")
//    public FakeStoreCategoryDto[] getAllCategory() {return ps.getAllCategory();}

    @GetMapping("products/category/{cat}/")
    public FakeStoreCategoryDto getProductByCategory(@PathVariable String cat) {return ps.getProductbyCategory(cat);}
}