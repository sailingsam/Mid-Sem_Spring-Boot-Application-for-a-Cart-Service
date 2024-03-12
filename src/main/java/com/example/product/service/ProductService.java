package com.example.product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.product.dto.*;

@Service
public class ProductService {

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";

    public FakeStoreProductDto[] getAllProducts(){
        FakeStoreProductDto response[] = restTemplate.getForObject(url+"/products/", FakeStoreProductDto[].class);
        return response;
    }
    public FakeStoreProductDto getProductbyId(Long id) {
        FakeStoreProductDto response = restTemplate.getForObject(url+"/products/"+id, FakeStoreProductDto.class);
        return response;
    }

//    public FakeStoreCategoryDto[] getAllCategory(){
//        FakeStoreCategoryDto response[] = restTemplate.getForObject(url+"/Category/", FakeStoreCategoryDto[].class);
//        return response;
//    }

    public FakeStoreCategoryDto getProductbyCategory(String cat) {
        FakeStoreCategoryDto response = restTemplate.getForObject(url+"/products/category/"+cat, FakeStoreCategoryDto.class);
        return response;
    }
}