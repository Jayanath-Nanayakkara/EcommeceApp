package com.bootcam.ecom.ecomapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="loved_property_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class LovedProperty {
    @Id
    @Column(name="property_id")
    private String propertyId;
    @Column(name="saved_dat")
    private Date savedDate;
    @ManyToOne
    @JoinColumn(name="user_property_id")
    private User userPropertyId;
    @ManyToOne
    @JoinColumn(name="product_property_id")
    private Product productPropertyId;


}
