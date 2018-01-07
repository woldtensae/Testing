package mum.test.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import mum.test.domain.Product;

@Repository
public interface ProductRepository {
	Map<Long, Product> getProducts();
	Product getProduct(Long id);

}
