package com.example.product.dto;

import org.springframework.stereotype.Service;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter

public class FakeStoreCategoryDto {
//    String[] categories;
    Long id;
    String title;
    double price;
    String category;
    String description;
    String image;

    public String getCat(){
        return category;
    }
    public void setCat(String cat){
        this.category = cat;
    }
}