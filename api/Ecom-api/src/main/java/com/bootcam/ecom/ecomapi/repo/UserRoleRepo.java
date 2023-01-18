package com.bootcam.ecom.ecomapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcam.ecom.ecomapi.entity.userRole;


@Repository
@EnableJpaRepositories
public interface UserRoleRepo extends JpaRepository<userRole,String >{
    
}