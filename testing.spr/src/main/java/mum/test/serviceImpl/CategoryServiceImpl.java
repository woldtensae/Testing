package mum.test.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.test.domain.Category;
import mum.test.repository.CategoryRepository;
import mum.test.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public Category findOne(long id) {
		return categoryRepository.findOne(id);
	}

	@Override
	public Map<Long, Category> findAll() {
		return categoryRepository.findALL();
	}

}
