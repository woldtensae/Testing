package mum.test.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private long id;
	private String catName;
	private List<Product> products;
	
	public Category(long id, String catName){
		this.id = id;
		this.catName = catName;
		products = new ArrayList<Product>();
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
