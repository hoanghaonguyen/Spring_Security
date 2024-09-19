package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    @GetMapping("")
    public String index() {
        return "Category Controller";
    }

    @GetMapping("/new")
    public String newCategory() {
        return "New Category Controller";
    }
}
