package com.example.demo.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoryDTO {
    private long id;
    private String name;
    private int status;
    private List<SubCategoryDTO> lis_subcategory;
}
