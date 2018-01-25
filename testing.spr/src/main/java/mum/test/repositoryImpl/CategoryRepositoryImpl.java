package mum.test.repositoryImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import mum.test.domain.Category;
import mum.test.repository.CategoryRepository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
	private Map<Long,Category> categories = new HashMap<Long, Category>();
	
	CategoryRepositoryImpl(){
		Category phone = new Category(1, "phone");
		Category food = new Category(2, "food");
		Category computers = new Category(3, "computers");
		categories.put(phone.getId(),phone);
		categories.put(food.getId(),food);
		categories.put(computers.getId(), computers);
	}
	
	@Override
	public Category findOne(Long id) {
		return categories.get(id);
	}

	@Override
	public Map<Long, Category> findALL() {
		return categories;
	}

}
