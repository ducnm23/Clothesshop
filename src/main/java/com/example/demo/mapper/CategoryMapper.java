package com.example.demo.mapper;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.entities.Category;
import com.example.demo.entities.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    @Autowired
    private SubCategoryMapper subCategoryMapper;
    public CategoryDTO toDTO(Category category){
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .status(category.getStatus())
                .lis_subcategory(category.getSubCategories().stream().map(category1 -> subCategoryMapper.toDTO(category1)).toList())
                .build();

    }
}
