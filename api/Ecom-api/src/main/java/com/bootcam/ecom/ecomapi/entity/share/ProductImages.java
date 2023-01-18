package com.bootcam.ecom.ecomapi.entity.share;


import com.bootcam.ecom.ecomapi.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="product_images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductImages {
    @Id
    @Column(name="property_id")
    private String property_id;
    @Embedded
    private FileResource resource;
    @ManyToOne
    private Product product;
}
