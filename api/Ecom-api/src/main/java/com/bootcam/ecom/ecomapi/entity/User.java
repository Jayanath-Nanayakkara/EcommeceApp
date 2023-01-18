package com.bootcam.ecom.ecomapi.entity;

import com.bootcam.ecom.ecomapi.entity.share.FileResource;
import com.bootcam.ecom.ecomapi.entity.share.UserNameResource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name="user_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @Column(name="propety_Id")
    private String propertyId;
    @Column(name="contact_number")
    private String contactNumber;
    @Embedded
    private UserNameResource name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="is_account_non_expired")
    private boolean isAccountNonExpired;
    @Column(name="is_account_non_locked")
    private boolean isAccountNonLocked;
    @Column(name="is_cedential_non_expied")
    private boolean isCedentialNonExpied;
    @Column(name="is_enabled")
    private boolean isEnabled;
    @Column(name="prefix")
    private String prefix;
    @Embedded
    private FileResource avatar;
    @OneToMany(mappedBy = "userPropertyId",cascade = CascadeType.ALL)
    private List<Orders> ordersList;
    @OneToMany(mappedBy = "userPropertyId",cascade = CascadeType.ALL)
    private List<LovedProperty> lovedProperties;

}

/*property_id; first_name; last_name; usercol; email; password; is_account_non_expired; is_account_non_locked; is_cedential_non_expied; is_enabled; prefix; avatar*/

