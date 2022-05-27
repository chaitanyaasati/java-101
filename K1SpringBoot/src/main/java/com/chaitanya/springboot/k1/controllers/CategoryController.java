package com.chaitanya.springboot.k1.controllers;

import com.chaitanya.springboot.k1.payloads.ApiResponse;
import com.chaitanya.springboot.k1.payloads.CategoryDto;
import com.chaitanya.springboot.k1.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController{

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
        CategoryDto createCategory = this.categoryService.createCategory(categoryDto);
        return new ResponseEntity<CategoryDto>(createCategory, HttpStatus.CREATED);
    }

    //update
    @PostMapping("/")
    public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryDto, @PathVariable Integer categoryId){
        CategoryDto updatedCategory = this.categoryService.updateCategory(categoryDto, categoryId);
        return new ResponseEntity<CategoryDto>(updatedCategory, HttpStatus.OK);
    }

    //delete
    @DeleteMapping("/{catId}")
    public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Integer categoryId){
        this.categoryService.deleteCategory(categoryId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("category is deleted successfully",false), HttpStatus.OK);
    }

    //get
    @GetMapping("/{categoryID")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable Integer categoryId){
        CategoryDto categoryDto  = this.categoryService.getCategory(categoryId);
        return new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);
    }

    //get all
    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>> getCategories(){
        List<CategoryDto> categoriesDto = this.categoryService.getCategories();
        return ResponseEntity.ok(categoriesDto);
    }

}
