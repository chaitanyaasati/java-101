package com.chaitanya.springboot.k1.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;
    @NotBlank
    @Size(min=4, message="Min size of category title is 4")
    private String categoryTitle;
    @NotBlank
    @Size(max=40, message="Max size of category desc is 40")
    @Size(min=10, message="Min size of category desc in 10")
    private String categoryDescription;
}
