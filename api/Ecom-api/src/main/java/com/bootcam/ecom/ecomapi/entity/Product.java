package com.bootcam.ecom.ecomapi.entity;


import com.bootcam.ecom.ecomapi.entity.share.ProductImages;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity(name="product_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    @Column(name="property_id")
    private String propertyId;
    @Column(name="display_nam")
    private String displayName;
    private String discription;
    @Column(name="unit_price")
    private double unitPrice;
    private int qty;
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<ProductImages> images;
    @Column(name="selling_price")
    private double sellingPrice;
    @OneToMany (mappedBy = "productPropertyId",cascade = CascadeType.ALL)
    private List<Orders> orderList;

    @OneToMany (mappedBy = "productPropertyId",cascade = CascadeType.ALL)
    private List<LovedProperty> lovedProperties;

}
/*property_id; display_name; discription; unit_price; qty; images; selling_price*/

