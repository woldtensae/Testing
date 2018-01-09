package mum.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mum.test.domain.Category;
import mum.test.repository.CategoryRepository;
import mum.test.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public Category findOne(long id) {
		return categoryRepository.findOne(id);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findALL();
	}

}
