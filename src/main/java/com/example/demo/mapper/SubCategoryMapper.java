package com.example.demo.mapper;

import com.example.demo.dto.SubCategoryDTO;
import com.example.demo.entities.SubCategory;
import org.springframework.stereotype.Component;

@Component
public class SubCategoryMapper {
    public SubCategoryDTO toDTO(SubCategory category){
        return SubCategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
