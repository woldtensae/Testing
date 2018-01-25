package mum.test.service;

import java.util.Map;

import mum.test.domain.Category;

public interface CategoryService {
	Category findOne(long id);
	Map<Long, Category> findAll();

}
