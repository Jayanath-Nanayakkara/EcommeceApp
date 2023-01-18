package com.bootcam.ecom.ecomapi.repo;


import com.bootcam.ecom.ecomapi.entity.share.ProductImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ProductImageRepo extends JpaRepository<ProductImages,String> {
}
