package com.smallBegin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cateogory_name")
	private int category_code;
	
	@Column(name="category_name")
	private String category_name;
	
	@Column(name="category_color")
	private String cateogory_color;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int category_code, String category_name, String cateogory_color) {
		super();
		this.category_code = category_code;
		this.category_name = category_name;
		this.cateogory_color = cateogory_color;
	}

	public int getCategory_code() {
		return category_code;
	}

	public void setCategory_code(int category_code) {
		this.category_code = category_code;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCateogory_color() {
		return cateogory_color;
	}

	public void setCateogory_color(String cateogory_color) {
		this.cateogory_color = cateogory_color;
	}

	@Override
	public String toString() {
		return "Category [category_code=" + category_code + ", category_name=" + category_name + ", cateogory_color="
				+ cateogory_color + "]";
	}
	
	
}
