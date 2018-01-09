package mum.test.service;

import java.util.List;

import mum.test.domain.Category;

public interface CategoryService {
	Category findOne(long id);
	List<Category> findAll();

}
