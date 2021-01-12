package com.mesavila.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mesavila.cursomc.domain.Category;
import com.mesavila.cursomc.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public Category getCategory(Integer id) {
		Optional<Category> category = repository.findById(id);
		return category.orElse(null);
	}

}
