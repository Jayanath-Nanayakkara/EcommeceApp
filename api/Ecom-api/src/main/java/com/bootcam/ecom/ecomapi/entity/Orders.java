package com.bootcam.ecom.ecomapi.entity;

import com.bootcam.ecom.ecomapi.entity.enums.OrderState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity(name="order_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Orders {
    @Id
    @Column(name="property_id")
    private String propertyId;
    private Date date;
    @Column(name="total_cost")
    private double totalCost;
    @Column(name="shipping_Address")
    private String shippingAddress;
    @Column(name="order_state")
    @Enumerated(EnumType.STRING)
    private OrderState orderState;
    private int oderQty;
    //productProperId;
    @ManyToOne()
    @JoinColumn(name="user_property_id")
    private User userPropertyId;
    @ManyToOne
    @JoinColumn(name="product_property_name")
    private Product productPropertyId;
    @OneToOne(mappedBy = "orderPropertyId")
    private Payment payment;
}
/*property_id; date; total_cost; shipping_address; order_state; oder_qty; product_proper_id; user_property_id; payment_payment_id*/