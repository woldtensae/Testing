package mum.test.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mum.test.domain.Category;
import mum.test.repository.CategoryRepository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
	private List<Category> categories = new ArrayList<Category>();
	
	CategoryRepositoryImpl(){
		Category phone = new Category(1, "phone");
		Category food = new Category(2, "food");
		Category computers = new Category(3, "computers");
		categories.add(phone);
		categories.add(food);
		categories.add(computers);
	}
	
	@Override
	public Category findOne(Long id) {
		return (Category)categories.stream().filter(e -> id == e.getId());
	}

	@Override
	public List<Category> findALL() {
		return categories;
	}

}
