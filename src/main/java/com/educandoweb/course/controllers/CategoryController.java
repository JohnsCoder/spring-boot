package com.educandoweb.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

     @Autowired
private CategoryService categoryService;

     @GetMapping
     public List<Category> findAll() {
          return categoryService.findAll(); 
     }

     @GetMapping("/{id}")
     public Category findById(@PathVariable Long id) {
          return categoryService.findById(id);
     }
}
