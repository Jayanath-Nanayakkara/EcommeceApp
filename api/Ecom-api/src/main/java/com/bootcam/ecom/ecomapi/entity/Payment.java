package com.bootcam.ecom.ecomapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity(name="payment_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
    @Id
    @Column(name="property_id")
    private String propertyId;
    @Column(name="payment_date")
    private Date paymentDate;
    private double amount;
    private String bank;
    @OneToOne
    @Column(name="order_property_id",unique = true)
    private Orders orderPropertyId;
}
/*property_id; pament_date; amount; bank*/
