package com.example.demo.resource;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.model.CategoryModel;
import com.example.demo.services.ServiceImpl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("category")
@RestController
public class CategoryRest {
    @Autowired
    private CategoryServiceImpl categoryService;
    @GetMapping("getAll")
    public ResponseEntity<List<CategoryDTO>> getAll(){
        List<CategoryDTO> list = categoryService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/add-category")
    public ResponseEntity<String> add(@ModelAttribute CategoryModel model){
        int result = categoryService.save(model);
        return new ResponseEntity<>("Them moi category thanh cong",HttpStatus.OK);
    }
}
