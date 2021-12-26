package com.smallBegin.service;

import java.util.List;

import com.smallBegin.entity.Category;

public interface CategoryService {

	public List<Category> getAllCategory();
	public Category getCategoryById(int category_id);
	public Category addOrUpdateCategory(Category category);
	public Category deleteCategory(int category_id) throws Exception;
	
}
