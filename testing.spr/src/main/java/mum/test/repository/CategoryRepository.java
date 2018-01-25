package mum.test.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import mum.test.domain.Category;

@Repository
public interface CategoryRepository {
	Category findOne(Long id);
	Map<Long, Category> findALL();
}
