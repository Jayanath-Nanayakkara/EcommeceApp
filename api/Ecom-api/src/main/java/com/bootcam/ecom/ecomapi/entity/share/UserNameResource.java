package com.bootcam.ecom.ecomapi.entity.share;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class UserNameResource {

    private String firstName;
    private String lastName;
}
