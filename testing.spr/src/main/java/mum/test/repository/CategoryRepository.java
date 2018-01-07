package mum.test.repository;

import java.util.List;

import mum.test.domain.Category;

public interface CategoryRepository {
	Category findOne(Long id);
	List<Category> findALL();
}
