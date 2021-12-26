package com.smallBegin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smallBegin.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
