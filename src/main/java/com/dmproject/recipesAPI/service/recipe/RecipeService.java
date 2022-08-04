package com.dmproject.recipesAPI.service.recipe;


import com.dmproject.recipesAPI.entity.Recipe;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RecipeService {

    ResponseEntity<Recipe> create(Recipe recipe);

    List<Recipe> findAll(Recipe recipe);

    ResponseEntity<Recipe> getById(Long id);

    ResponseEntity<Recipe> update(Long id, Recipe recipe);

    ResponseEntity<Recipe> delete(Long id);


}
