package com.bootcam.ecom.ecomapi.dto.request;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="product_table")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    
    
    private String displayName;
    private String discription;
    private double unitPrice;
    private int qty;
    
    private double sellingPrice;
   

}
/*property_id; display_name; discription; unit_price; qty; images; selling_price*/

