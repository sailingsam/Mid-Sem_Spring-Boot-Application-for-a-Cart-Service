package com.example.product.dto;

import org.springframework.stereotype.Service;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter

public class FakeStoreProductDto {
    Long id;
    String title;
    double price;
    String category;
    String description;
    String image;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
}