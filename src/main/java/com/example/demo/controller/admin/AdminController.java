package com.example.demo.controller.admin;

import com.example.demo.model.CategoryModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/home")
    public String index(Model model){
       model.addAttribute("category",new CategoryModel());
        return "admin/Dashboard";
    }

    @PostMapping ("/add-category")
    public String add(@ModelAttribute CategoryModel model){
        System.out.println(model.getName());
        return "admin/Dashboard";
    }
}
