package mum.test.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.test.domain.Product;
import mum.test.repository.ProductRepository;
import mum.test.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepostory;
	
	@Override
	public Map<Long, Product> products() {
		return productRepostory.getProducts();
	}

	@Override
	public Product product(Long id) {
		return productRepostory.getProduct(id);
	}

}
