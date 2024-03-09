package com.example.demo.services;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.entities.Category;
import com.example.demo.model.CategoryModel;

import java.util.List;

public interface ICategory {
    List<CategoryDTO> getAll();
    int save(CategoryModel model);
}
