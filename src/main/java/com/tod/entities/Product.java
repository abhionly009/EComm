package com.tod.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;
	private String name;
	private String description;
	private double price;
	private String images;
	private double discount;
	private int quantity;
	
	@ManyToOne
	private Category category;
	
	
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product(long pId, String name, String description, double price, double discount, int quantity,String images,
			Category category) {
		super();
		this.pId = pId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.images = images;
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", images=" + images + ", discount=" + discount + ", quantity=" + quantity + ", category=" + category
				+ "]";
	}
	
	
}
