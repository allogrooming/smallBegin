package com.smallBegin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smallBegin.entity.Category;
import com.smallBegin.repository.CategoryRepository;
import com.smallBegin.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(int category_id) {
		return categoryRepository.findById(category_id).orElse(null);
	}

	@Override
	public Category addOrUpdateCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category deleteCategory(int category_id) throws Exception {
		Category deleteCategory = null;
		
		try {
			deleteCategory = categoryRepository.findById(category_id).orElse(null);
			if(deleteCategory == null) {
				throw new Exception("Not available");
			}else {
				categoryRepository.deleteById(category_id);
			}
		}
		catch(Exception e){
			throw e;
		}
		
		return deleteCategory;
	}

}
