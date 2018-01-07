package mum.test.repositoryImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import mum.test.domain.Product;
import mum.test.repository.ProductRepository;
@Repository
public class ProductRepositoryImpl implements ProductRepository{
	Map<Long, Product> productData = new  HashMap<Long, Product>();
	@Override
	public Map<Long, Product> getProducts() {
		Product product1 = new Product(1, "sumsung phone", 1000);
		Product product2 = new Product(2, "Iphone phone", 2000);
		Product product3 = new Product(3, "Motorola phone", 3000);
		productData.put(product1.getId(), product1);
		productData.put(product2.getId(), product2);
		productData.put(product3.getId(), product3);
		return productData;
	}
	@Override
	public Product getProduct(Long id) {
		return productData.get(id);
	}
}
