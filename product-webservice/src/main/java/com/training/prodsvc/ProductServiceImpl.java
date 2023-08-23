package com.training.prodsvc;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
	
	List<Product> prodList = new ArrayList<>();

	@Override
	public String getProdInfo() {
		return "Retrieving Product Info";
	}

	@Override
	public void addProduct(Product prod) {
		System.out.println(prod.getProdName());
		prodList.add(prod);
		
	}

}
