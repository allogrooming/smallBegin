package com.smallBegin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smallBegin.entity.Category;
import com.smallBegin.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/getAllCategory")
	public ResponseEntity<List<Category>> getAllCategory(){
		
		List<Category> category = null;
		
		try {
			category = categoryService.getAllCategory();
		}
		catch(Exception e) {
			e.getMessage();
		}
		
		return new ResponseEntity<List<Category>>(category, HttpStatus.OK);
	}

}
