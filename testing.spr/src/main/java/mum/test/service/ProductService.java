package mum.test.service;

import java.util.Map;

import mum.test.domain.Product;


public interface ProductService {
	Map<Long, Product> products();
}
