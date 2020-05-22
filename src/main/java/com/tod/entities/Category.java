package com.tod.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CategoryId;
	private String name;
	private String description;
	
	@OneToMany( targetEntity=Product.class ,mappedBy = "category")
	private List<Product> product;

	public long getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(long categoryId) {
		CategoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Category(long categoryId, String name, String description, List<Product> product) {
		super();
		CategoryId = categoryId;
		this.name = name;
		this.description = description;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [CategoryId=" + CategoryId + ", name=" + name + ", description=" + description + ", product="
				+ product + "]";
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
