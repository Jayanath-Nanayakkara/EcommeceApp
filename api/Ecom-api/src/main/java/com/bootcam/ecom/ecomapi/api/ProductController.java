package com.bootcam.ecom.ecomapi.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcam.ecom.ecomapi.dto.request.RequestProductDTO;

import util.StanderdRespond;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @PostMapping("/member/create")
    public ResponseEntity<StanderdRespond> createProduct(
        @RequestBody RequestProductDTO dto
    ){
        return null;
    }
}
