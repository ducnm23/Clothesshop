package com.example.demo.services.ServiceImpl;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.entities.Category;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.model.CategoryModel;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.services.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategory {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<CategoryDTO> getAll(){
        List<CategoryDTO> list_categoryDto = categoryRepository.findAll().stream().map(e->categoryMapper.toDTO(e)).toList();
        return list_categoryDto;
    }

    @Override
    public int save(CategoryModel model) {
        try{
            Category category = new Category();
            category.setName(model.getName());
            category.setStatus(model.getStatus());
            categoryRepository.save(category);
            return 1;
        }catch(Exception e){
            return 0;
        }

    }
}
