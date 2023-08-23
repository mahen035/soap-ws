package com.training.prodsvc;

public class ProductWsTester {

	public static void main(String[] args) {
		
		ProductServiceImplService  obj = new ProductServiceImplService();
		
		ProductServiceImpl  prod = obj.getProductServiceImpl();
		
		Product p1 = new Product();
		p1.setProdId("101");
		p1.setProdName("Laptop");
		
		prod.addProduct(p1);
		
		//System.out.println(prod.getProdInfo());

	}

}
