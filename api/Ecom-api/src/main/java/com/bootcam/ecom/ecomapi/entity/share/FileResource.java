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

public class FileResource {
    private String directory;
    private String hash;
    private String resource_url;
    private String file_name;

}
