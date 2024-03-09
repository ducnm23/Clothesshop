package com.example.demo.controller;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.services.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class HomeController {
    @Autowired
    private ICategory category;
    @GetMapping("/home")
    public String index(Model model){
        List<CategoryDTO> list = category.getAll();
        model.addAttribute("category_list",list);
        return "user/home";
    }
}
